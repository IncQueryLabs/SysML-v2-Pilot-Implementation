package CausationConnections {	
	doc 
	/* 
	 * This package provides a library model modeling causes, effects, and causation connections 
	 * between them.
	 */

	abstract occurrence causes[*] {
		doc /* Occurrences that are causes. */
	}
	
	abstract occurrence effects[*]  {
		doc /* Occurrences that are effects. */
	}
	
	abstract connection def Multicausation {
		doc
		/*
		 * A Multicausation connection models the situation in which one set of
		 * occurrences causes another.
		 * 
		 * To create a Multicausation connection, specialize this connection definition
		 * adding specific end features of the relavent types. Ends representing causes
		 * should subset 'causes', while ends representing effects should subset 'effects'.
		 * There must be at least one cause and at least one effect.
		 */
		 
		private import SequenceFunctions::*;
		 
		occurrence causes[1..*] :>> causes :> participant {
			doc /* The causing occurrences. */
		}
		occurrence effects[1..*] :>> effects :> participant {
			doc /* The effect occurrences caused by the causing occurrences. */
		}
		
		private assert constraint disjointCauseEffect {
			doc /* causes must be disjoint from effects. */
			isEmpty(intersection(causes, effects))
		}
		
		private succession causalOrdering first causes.startShot[nCauses] then effects[nEffects] {
			doc /* All causes must exist before all effects. */
			attribute nCauses = size(causes);
			attribute nEffects = size(effects);
		}
	}
	
	abstract connection multicausations : Multicausation[*] {
		doc /* multicausations is the base feature for Multicausation ConnectionUsages. */
	}
	
	connection def Causation :> Multicausation {
		doc
		/*
		 * A Causation is a binary Multicausation in which a single cause occurrence
		 * causes a single effect occurrence.
		 */
		 
		end occurrence theCause :>> causes :> source {
			doc /* The single causing occurrence. */
		}
		
		end occurrence theEffect :>> effects :> target {
			doc /* The single effect occurrence resulting from the cause. */
		}
	}
	
	abstract connection causations : Causation[*] {
		doc /* causations is the base feature for Causation ConnectionUsages. */
	}
}
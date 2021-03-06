/*
* generated by Xtext
*/
package org.xtext.anomaly.report.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class ReportGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ReportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Report");
		private final Assignment cAnomaliesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cAnomaliesAnomalyParserRuleCall_0 = (RuleCall)cAnomaliesAssignment.eContents().get(0);
		
		//Report:
		//	anomalies+=Anomaly*;
		public ParserRule getRule() { return rule; }

		//anomalies+=Anomaly*
		public Assignment getAnomaliesAssignment() { return cAnomaliesAssignment; }

		//Anomaly
		public RuleCall getAnomaliesAnomalyParserRuleCall_0() { return cAnomaliesAnomalyParserRuleCall_0; }
	}

	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString returns ecore::EString:
		//	STRING | ID;
		public ParserRule getRule() { return rule; }

		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}

	public class AnomalyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Anomaly");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cShadowingParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cCompletenessParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cRedundancyParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cSyntacticalParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cReachabilityParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		
		//Anomaly:
		//	Shadowing | Completeness | Redundancy | Syntactical | Reachability;
		public ParserRule getRule() { return rule; }

		//Shadowing | Completeness | Redundancy | Syntactical | Reachability
		public Alternatives getAlternatives() { return cAlternatives; }

		//Shadowing
		public RuleCall getShadowingParserRuleCall_0() { return cShadowingParserRuleCall_0; }

		//Completeness
		public RuleCall getCompletenessParserRuleCall_1() { return cCompletenessParserRuleCall_1; }

		//Redundancy
		public RuleCall getRedundancyParserRuleCall_2() { return cRedundancyParserRuleCall_2; }

		//Syntactical
		public RuleCall getSyntacticalParserRuleCall_3() { return cSyntacticalParserRuleCall_3; }

		//Reachability
		public RuleCall getReachabilityParserRuleCall_4() { return cReachabilityParserRuleCall_4; }
	}

	public class ShadowingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Shadowing");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cShadowingKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDescriptionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_1_0 = (RuleCall)cDescriptionAssignment_1.eContents().get(0);
		private final Assignment cShadowingAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cShadowingEObjectCrossReference_2_0 = (CrossReference)cShadowingAssignment_2.eContents().get(0);
		private final RuleCall cShadowingEObjectEStringParserRuleCall_2_0_1 = (RuleCall)cShadowingEObjectCrossReference_2_0.eContents().get(1);
		private final Assignment cShadowedAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cShadowedEObjectCrossReference_3_0 = (CrossReference)cShadowedAssignment_3.eContents().get(0);
		private final RuleCall cShadowedEObjectEStringParserRuleCall_3_0_1 = (RuleCall)cShadowedEObjectCrossReference_3_0.eContents().get(1);
		
		//Shadowing:
		//	"Shadowing" description=STRING shadowing=[ecore::EObject|EString] shadowed=[ecore::EObject|EString];
		public ParserRule getRule() { return rule; }

		//"Shadowing" description=STRING shadowing=[ecore::EObject|EString] shadowed=[ecore::EObject|EString]
		public Group getGroup() { return cGroup; }

		//"Shadowing"
		public Keyword getShadowingKeyword_0() { return cShadowingKeyword_0; }

		//description=STRING
		public Assignment getDescriptionAssignment_1() { return cDescriptionAssignment_1; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_1_0() { return cDescriptionSTRINGTerminalRuleCall_1_0; }

		//shadowing=[ecore::EObject|EString]
		public Assignment getShadowingAssignment_2() { return cShadowingAssignment_2; }

		//[ecore::EObject|EString]
		public CrossReference getShadowingEObjectCrossReference_2_0() { return cShadowingEObjectCrossReference_2_0; }

		//EString
		public RuleCall getShadowingEObjectEStringParserRuleCall_2_0_1() { return cShadowingEObjectEStringParserRuleCall_2_0_1; }

		//shadowed=[ecore::EObject|EString]
		public Assignment getShadowedAssignment_3() { return cShadowedAssignment_3; }

		//[ecore::EObject|EString]
		public CrossReference getShadowedEObjectCrossReference_3_0() { return cShadowedEObjectCrossReference_3_0; }

		//EString
		public RuleCall getShadowedEObjectEStringParserRuleCall_3_0_1() { return cShadowedEObjectEStringParserRuleCall_3_0_1; }
	}

	public class CompletenessElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Completeness");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCompletenessKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDescriptionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_1_0 = (RuleCall)cDescriptionAssignment_1.eContents().get(0);
		private final Assignment cMissedMethodAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cMissedMethodEObjectCrossReference_2_0 = (CrossReference)cMissedMethodAssignment_2.eContents().get(0);
		private final RuleCall cMissedMethodEObjectEStringParserRuleCall_2_0_1 = (RuleCall)cMissedMethodEObjectCrossReference_2_0.eContents().get(1);
		private final Assignment cSecurityConstraintAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cSecurityConstraintEObjectCrossReference_3_0 = (CrossReference)cSecurityConstraintAssignment_3.eContents().get(0);
		private final RuleCall cSecurityConstraintEObjectEStringParserRuleCall_3_0_1 = (RuleCall)cSecurityConstraintEObjectCrossReference_3_0.eContents().get(1);
		
		//Completeness:
		//	"Completeness" description=STRING missedMethod+=[ecore::EObject|EString]+
		//	securityConstraint=[ecore::EObject|EString];
		public ParserRule getRule() { return rule; }

		//"Completeness" description=STRING missedMethod+=[ecore::EObject|EString]+ securityConstraint=[ecore::EObject|EString]
		public Group getGroup() { return cGroup; }

		//"Completeness"
		public Keyword getCompletenessKeyword_0() { return cCompletenessKeyword_0; }

		//description=STRING
		public Assignment getDescriptionAssignment_1() { return cDescriptionAssignment_1; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_1_0() { return cDescriptionSTRINGTerminalRuleCall_1_0; }

		//missedMethod+=[ecore::EObject|EString]+
		public Assignment getMissedMethodAssignment_2() { return cMissedMethodAssignment_2; }

		//[ecore::EObject|EString]
		public CrossReference getMissedMethodEObjectCrossReference_2_0() { return cMissedMethodEObjectCrossReference_2_0; }

		//EString
		public RuleCall getMissedMethodEObjectEStringParserRuleCall_2_0_1() { return cMissedMethodEObjectEStringParserRuleCall_2_0_1; }

		//securityConstraint=[ecore::EObject|EString]
		public Assignment getSecurityConstraintAssignment_3() { return cSecurityConstraintAssignment_3; }

		//[ecore::EObject|EString]
		public CrossReference getSecurityConstraintEObjectCrossReference_3_0() { return cSecurityConstraintEObjectCrossReference_3_0; }

		//EString
		public RuleCall getSecurityConstraintEObjectEStringParserRuleCall_3_0_1() { return cSecurityConstraintEObjectEStringParserRuleCall_3_0_1; }
	}

	public class RedundancyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Redundancy");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRedundancyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDescriptionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_1_0 = (RuleCall)cDescriptionAssignment_1.eContents().get(0);
		private final Assignment cContainingAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cContainingEObjectCrossReference_2_0 = (CrossReference)cContainingAssignment_2.eContents().get(0);
		private final RuleCall cContainingEObjectEStringParserRuleCall_2_0_1 = (RuleCall)cContainingEObjectCrossReference_2_0.eContents().get(1);
		private final Assignment cContainedAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cContainedEObjectCrossReference_3_0 = (CrossReference)cContainedAssignment_3.eContents().get(0);
		private final RuleCall cContainedEObjectEStringParserRuleCall_3_0_1 = (RuleCall)cContainedEObjectCrossReference_3_0.eContents().get(1);
		
		//Redundancy:
		//	"Redundancy" description=STRING containing=[ecore::EObject|EString] contained=[ecore::EObject|EString];
		public ParserRule getRule() { return rule; }

		//"Redundancy" description=STRING containing=[ecore::EObject|EString] contained=[ecore::EObject|EString]
		public Group getGroup() { return cGroup; }

		//"Redundancy"
		public Keyword getRedundancyKeyword_0() { return cRedundancyKeyword_0; }

		//description=STRING
		public Assignment getDescriptionAssignment_1() { return cDescriptionAssignment_1; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_1_0() { return cDescriptionSTRINGTerminalRuleCall_1_0; }

		//containing=[ecore::EObject|EString]
		public Assignment getContainingAssignment_2() { return cContainingAssignment_2; }

		//[ecore::EObject|EString]
		public CrossReference getContainingEObjectCrossReference_2_0() { return cContainingEObjectCrossReference_2_0; }

		//EString
		public RuleCall getContainingEObjectEStringParserRuleCall_2_0_1() { return cContainingEObjectEStringParserRuleCall_2_0_1; }

		//contained=[ecore::EObject|EString]
		public Assignment getContainedAssignment_3() { return cContainedAssignment_3; }

		//[ecore::EObject|EString]
		public CrossReference getContainedEObjectCrossReference_3_0() { return cContainedEObjectCrossReference_3_0; }

		//EString
		public RuleCall getContainedEObjectEStringParserRuleCall_3_0_1() { return cContainedEObjectEStringParserRuleCall_3_0_1; }
	}

	public class SyntacticalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Syntactical");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSyntacticalKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDescriptionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_1_0 = (RuleCall)cDescriptionAssignment_1.eContents().get(0);
		private final Assignment cMissedRolesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cMissedRolesEObjectCrossReference_2_0 = (CrossReference)cMissedRolesAssignment_2.eContents().get(0);
		private final RuleCall cMissedRolesEObjectEStringParserRuleCall_2_0_1 = (RuleCall)cMissedRolesEObjectCrossReference_2_0.eContents().get(1);
		
		//Syntactical:
		//	"Syntactical" description=STRING missedRoles+=[ecore::EObject|EString]+;
		public ParserRule getRule() { return rule; }

		//"Syntactical" description=STRING missedRoles+=[ecore::EObject|EString]+
		public Group getGroup() { return cGroup; }

		//"Syntactical"
		public Keyword getSyntacticalKeyword_0() { return cSyntacticalKeyword_0; }

		//description=STRING
		public Assignment getDescriptionAssignment_1() { return cDescriptionAssignment_1; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_1_0() { return cDescriptionSTRINGTerminalRuleCall_1_0; }

		//missedRoles+=[ecore::EObject|EString]+
		public Assignment getMissedRolesAssignment_2() { return cMissedRolesAssignment_2; }

		//[ecore::EObject|EString]
		public CrossReference getMissedRolesEObjectCrossReference_2_0() { return cMissedRolesEObjectCrossReference_2_0; }

		//EString
		public RuleCall getMissedRolesEObjectEStringParserRuleCall_2_0_1() { return cMissedRolesEObjectEStringParserRuleCall_2_0_1; }
	}

	public class ReachabilityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Reachability");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReachabilityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDescriptionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_1_0 = (RuleCall)cDescriptionAssignment_1.eContents().get(0);
		private final Assignment cUnreachableResourcesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cUnreachableResourcesEObjectCrossReference_2_0 = (CrossReference)cUnreachableResourcesAssignment_2.eContents().get(0);
		private final RuleCall cUnreachableResourcesEObjectEStringParserRuleCall_2_0_1 = (RuleCall)cUnreachableResourcesEObjectCrossReference_2_0.eContents().get(1);
		
		//Reachability:
		//	"Reachability" description=STRING unreachableResources+=[ecore::EObject|EString]+;
		public ParserRule getRule() { return rule; }

		//"Reachability" description=STRING unreachableResources+=[ecore::EObject|EString]+
		public Group getGroup() { return cGroup; }

		//"Reachability"
		public Keyword getReachabilityKeyword_0() { return cReachabilityKeyword_0; }

		//description=STRING
		public Assignment getDescriptionAssignment_1() { return cDescriptionAssignment_1; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_1_0() { return cDescriptionSTRINGTerminalRuleCall_1_0; }

		//unreachableResources+=[ecore::EObject|EString]+
		public Assignment getUnreachableResourcesAssignment_2() { return cUnreachableResourcesAssignment_2; }

		//[ecore::EObject|EString]
		public CrossReference getUnreachableResourcesEObjectCrossReference_2_0() { return cUnreachableResourcesEObjectCrossReference_2_0; }

		//EString
		public RuleCall getUnreachableResourcesEObjectEStringParserRuleCall_2_0_1() { return cUnreachableResourcesEObjectEStringParserRuleCall_2_0_1; }
	}
	
	
	private final ReportElements pReport;
	private final EStringElements pEString;
	private final AnomalyElements pAnomaly;
	private final ShadowingElements pShadowing;
	private final CompletenessElements pCompleteness;
	private final RedundancyElements pRedundancy;
	private final SyntacticalElements pSyntactical;
	private final ReachabilityElements pReachability;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ReportGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pReport = new ReportElements();
		this.pEString = new EStringElements();
		this.pAnomaly = new AnomalyElements();
		this.pShadowing = new ShadowingElements();
		this.pCompleteness = new CompletenessElements();
		this.pRedundancy = new RedundancyElements();
		this.pSyntactical = new SyntacticalElements();
		this.pReachability = new ReachabilityElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.anomaly.report.Report".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Report:
	//	anomalies+=Anomaly*;
	public ReportElements getReportAccess() {
		return pReport;
	}
	
	public ParserRule getReportRule() {
		return getReportAccess().getRule();
	}

	//EString returns ecore::EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}

	//Anomaly:
	//	Shadowing | Completeness | Redundancy | Syntactical | Reachability;
	public AnomalyElements getAnomalyAccess() {
		return pAnomaly;
	}
	
	public ParserRule getAnomalyRule() {
		return getAnomalyAccess().getRule();
	}

	//Shadowing:
	//	"Shadowing" description=STRING shadowing=[ecore::EObject|EString] shadowed=[ecore::EObject|EString];
	public ShadowingElements getShadowingAccess() {
		return pShadowing;
	}
	
	public ParserRule getShadowingRule() {
		return getShadowingAccess().getRule();
	}

	//Completeness:
	//	"Completeness" description=STRING missedMethod+=[ecore::EObject|EString]+
	//	securityConstraint=[ecore::EObject|EString];
	public CompletenessElements getCompletenessAccess() {
		return pCompleteness;
	}
	
	public ParserRule getCompletenessRule() {
		return getCompletenessAccess().getRule();
	}

	//Redundancy:
	//	"Redundancy" description=STRING containing=[ecore::EObject|EString] contained=[ecore::EObject|EString];
	public RedundancyElements getRedundancyAccess() {
		return pRedundancy;
	}
	
	public ParserRule getRedundancyRule() {
		return getRedundancyAccess().getRule();
	}

	//Syntactical:
	//	"Syntactical" description=STRING missedRoles+=[ecore::EObject|EString]+;
	public SyntacticalElements getSyntacticalAccess() {
		return pSyntactical;
	}
	
	public ParserRule getSyntacticalRule() {
		return getSyntacticalAccess().getRule();
	}

	//Reachability:
	//	"Reachability" description=STRING unreachableResources+=[ecore::EObject|EString]+;
	public ReachabilityElements getReachabilityAccess() {
		return pReachability;
	}
	
	public ParserRule getReachabilityRule() {
		return getReachabilityAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}

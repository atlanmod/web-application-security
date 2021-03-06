/**
 */
package report;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see report.ReportPackage
 * @generated
 */
public interface ReportFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReportFactory eINSTANCE = report.impl.ReportFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Report</em>'.
	 * @generated
	 */
	Report createReport();

	/**
	 * Returns a new object of class '<em>Shadowing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shadowing</em>'.
	 * @generated
	 */
	Shadowing createShadowing();

	/**
	 * Returns a new object of class '<em>Completeness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Completeness</em>'.
	 * @generated
	 */
	Completeness createCompleteness();

	/**
	 * Returns a new object of class '<em>Redundancy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Redundancy</em>'.
	 * @generated
	 */
	Redundancy createRedundancy();

	/**
	 * Returns a new object of class '<em>Syntactical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Syntactical</em>'.
	 * @generated
	 */
	Syntactical createSyntactical();

	/**
	 * Returns a new object of class '<em>Reachability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reachability</em>'.
	 * @generated
	 */
	Reachability createReachability();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ReportPackage getReportPackage();

} //ReportFactory

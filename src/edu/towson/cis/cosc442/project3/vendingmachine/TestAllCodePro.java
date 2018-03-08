package edu.towson.cis.cosc442.project3.vendingmachine;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAllCodePro</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 3/7/18 7:00 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	VendingMachineTestCodePro.class,
	VendingMachineItemTestCodePro.class,
	VendingMachineExceptionTestCodePro.class,
})
public class TestAllCodePro {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 3/7/18 7:00 PM
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAllCodePro.class });
	}
}

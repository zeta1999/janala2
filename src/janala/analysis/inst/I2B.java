/*
 * Author: Koushik Sen (ksen@cs.berkeley.edu)
 */

package janala.analysis.inst;

public class I2B extends Instruction {
    public I2B(int iid, int mid) {
        super(iid, mid);
    }

    public void visit(IVisitor visitor) {
	visitor.visitI2B(this);
    }

    @Override
    public String toString() {
        return "I2B iid="+iid+" mid="+mid;
    }
}
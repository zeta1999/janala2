/*
 * Author: Koushik Sen (ksen@cs.berkeley.edu)
 */

package janala.analysis.inst;

public class BIPUSH extends Instruction {
    int value;

    public BIPUSH(int iid, int mid, int value) {
        super(iid, mid);
        this.value = value;
    }

    public void visit(IVisitor visitor) {
	visitor.visitBIPUSH(this);
    }

    @Override
    public String toString() {
        return "BIPUSH iid="+iid+" mid="+mid+" value="+value;
    }
}
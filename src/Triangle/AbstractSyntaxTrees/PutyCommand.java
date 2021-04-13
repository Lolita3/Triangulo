package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;


public class PutyCommand extends Command {

    public Vname VN;
    public Expression C1;
    public Expression C2;

    public PutyCommand (Vname vAST, Expression eAST1, Expression eAST2, SourcePosition thePosition) {
        super (thePosition);
        VN = vAST;
        C1 = eAST1;
        C2 = eAST2;
    }

    public Object visit(Visitor v, Object o) {
        return v.visitPutyCommand(this, o);
    }
}

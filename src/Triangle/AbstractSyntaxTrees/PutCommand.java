package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;


public class PutCommand extends Command {

    public PutCommand (Vname vAst, Command c1AST,TypeDenoter tAST , Command c2AST,
                       SourcePosition thePosition) {
        super (thePosition);
        VN = vAst;
        C1 = c1AST;
        TD = tAST;
        C2 = c2AST;

    }

    public Object visit(Visitor v, Object o) {
        return v.visitPutCommand(this, o);
    }
    public Vname VN;
    public Command C1, C2;
    public TypeDenoter TD;
}

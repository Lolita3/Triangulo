package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;


public class RunCommand extends Command {

    public RunCommand (IntegerLiteral iLAST, Command cAST,
                      SourcePosition thePosition) {
        super (thePosition);
        IL = iLAST;
        C = cAST;

    }

    public Object visit(Visitor v, Object o) {
        return v.visitRunCommand(this, o);
    }
    public IntegerLiteral IL;
    public Command C;
}


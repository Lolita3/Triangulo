package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;


public class ForCommand extends Command {

    public ForCommand (Vname vAst, IntegerLiteral i1AST,IntegerLiteral i2AST , Command cAST,
                       SourcePosition thePosition) {
        super (thePosition);
        VN = vAst;
        IL1 = i1AST;
        IL2 = i2AST;
        C = cAST;

    }

    public Object visit(Visitor v, Object o) {
        return v.visitForCommand(this, o);
    }
    public Vname VN;
    public IntegerLiteral IL1, IL2;
    public Command C;
}
//case Token.FOR:{
//        acceptIt();
//        Vname vAST = parseVname();
//        accept(Token.FROM);
//        IntegerLiteral i1AST = parseIntegerLiteral();
//        accept(Token.TO);
//        IntegerLiteral i2AST = parseIntegerLiteral();
//        accept(Token.DO);
//        Command cAST = parseSingleCommand();
//        finish(commandPos);
//        commandAST = new ForCommand(vAST,i1AST, i2AST, cAST,commandPos);
//        }
//        break;
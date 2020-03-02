import jdk.internal.org.objectweb.asm.tree.analysis.Value;

public class Attack {
    Type type;


    Attack(Type t) {
        type = t;
    }
    Type getType(){
        return type;
    }


}

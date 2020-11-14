import jdk.internal.org.objectweb.asm.tree.analysis.Value;

public class Attack {
    Type type;  //// to jest deklaracja obiektu type klasy Type?


    Attack(Type t) {
        type = t;  
    }
    Type getType(){
        return type;
    }


}

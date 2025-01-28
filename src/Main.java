//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        for (int i = 0; i < args.length; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println(args[i]);
        }

        for(String value: args) {
            System.out.println(value);
        }

        System.out.println("Hello World!");

        for (var i=0;i<10;i++) {
            System.out.println(i + ". Advanced Software Construction");
        }
    }
}

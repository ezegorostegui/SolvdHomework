package execute;

import enums.Menus;
import exceptions.ProjectExceptions;


public class Execute {
    public static void main(String[] arg) throws ProjectExceptions {
        try {
            Menus.studentMenu();
            Menus.professorMenu();
        } catch(Exception e){
            throw new ProjectExceptions("System error.");
        }
    }
}
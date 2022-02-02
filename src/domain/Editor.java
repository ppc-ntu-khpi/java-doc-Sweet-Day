package domain;
/**
 * Клас, який описує редактора
 * @author Віка Думініке
 */
public class Editor extends Artist {
    /** 
     * Конструктор класа Editor  
     * @param electronicEditing Чи працює редактор з паперовими документами
     * @param skiils Навички
     * @param name Прізвище та ім'я
     * @param jobTitle Посада
     * @param level Розряд чи категорія
     * @param dept Відділ, де працює співробітник
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    /**
     * True, якщо редактор надає перевагу паперам
     */
    private boolean electronicEditing;

    public boolean getPreferences() {
        return electronicEditing;
    }

    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}

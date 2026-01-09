class Node{
    int age;
    String name;
    String school;
    int id;
    Node prev, next;

    Node(int age, String name, String school, int id){
        this.age = age;
        this.name = name;
        this.school = school;
        this.id = id;
    }
}

public class METHODS {
    Node head;

    void addLast(int age, String name, String school, int id){
        Node data = new Node(age, name, school, id);

        if (head == null){
            head = data;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }

        temp.next = data;
        data.prev = temp;
        return;

    }

    void showlist(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.age + " " + temp.name + " " + temp.school + " " + temp.id);
            temp = temp.next;
        }
    }

    void addLastMenu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age of student: ");
        int age = sc.nextInt();
        if (age < 18){
            System.out.println("\t\nAge must be greater than 18 to be admitted.\t");
            return;
        }

        System.out.println("Enter name of student: ");
        String name = sc.next();
        if (name.matches(".*[0-9].*")) {
            System.out.println("\t\nName cannot contain numbers.\t");
            return;
        }

        System.out.println("Enter school of student: ");
        String school = sc.next();
        if (school.matches(".*[0-9].*")) {
            System.out.println("\t\nSchool name cannot contain numbers.\t");
            return;
        }

        System.out.println("Enter id of student: ");
        String idString = sc.next();
        if (!idString.matches(".*[0-9].*")) {
            System.out.println("\t\nID cannot contain letters.\t");
            return;
        }
        int id = Integer.parseInt(idString);


        System.out.println("Student added successfully to the end of the list.\n\n");
        addLast(age, name, school, id);
    }

    void addfirstMenu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age of student: ");
        int age = sc.nextInt();
        if (age < 18){
            System.out.println("\t\nAge must be greater than 18 to be admitted.\t");
            return;
        }

        System.out.println("Enter name of student: ");
        String name = sc.next();
        if (name.matches(".*[0-9].*")) {
            System.out.println("\t\nName cannot contain numbers.\t");
            return;
        }

        System.out.println("Enter school of student: ");
        String school = sc.next();
        if (school.matches(".*[0-9].*")) {
            System.out.println("\t\nSchool name cannot contain numbers.\t");
            return;
        }

        System.out.println("Enter id of student: ");
        String idString = sc.next();
        if (!idString.matches(".*[0-9].*")) {
            System.out.println("\t\nID cannot contain letters.\t");
            return;
        }
        int id = Integer.parseInt(idString);

        System.out.println("Student added successfully to the beginning of the list.\n\n");
        addFirst(age, name, school, id);
    }
    void addFirst(int age, String name, String school, int id){
        Node data = new Node(age, name, school, id);

        if (head == null){
            head = data;
            return;
        }


        data.next = head;
        head.prev = data;
        head = data;
        return;
    }

    void MENU(){
        Scanner sc = new Scanner(System.in);


        while(true){
            System.out.println("===============================");
            System.out.println("\t-CLASSROOM MANAGER-");
            System.out.println("===============================");
            System.out.println("\n1.\t [ADD STUDENT AT THE BEGINNING]");
            System.out.println("2.\t [ADD STUDENT AT THE END]");
            System.out.println("3.\t [DISPLAY LIST OF STUDENTS]");
            System.out.println("4.\t [DISPLAY LIST OF STUDENTS IN REVERSE]");
            System.out.println("5.\t [ACTUALLY REVERSE THE LIST OF STUDENTS]");
            System.out.println("6.\t [SEARCH STUDENT]");
            System.out.println("7.\t [DELETE FIRST STUDENT]");
            System.out.println("8.\t [DELETE LAST STUDENT]");
            System.out.println("9.\t [COUNT NUMBER OF STUDENTS]");
            System.out.println("10.\t [EXIT]");

            int choice = sc.nextInt();

            switch(choice){
                case 1: addfirstMenu();break;
                case 2:addLastMenu(); break;
                case 3: showlist(); break;
                case 4:
            }
        }




    }

}

public void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    METHODS m = new METHODS();
    m.MENU();


}


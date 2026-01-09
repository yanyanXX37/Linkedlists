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

}

public void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    METHODS m = new METHODS();
    METHODS m1 = new METHODS();

    m.addLast(20, "Aman", "SIT", 123);
    m.addLast(21, "Rahul", "SIT", 124);
    m.addLast(22, "Ravi", "SIT", 125);

    m.showlist();
    System.out.println();
    System.out.println();

    m1.addFirst(20, "Aman", "SIT", 123);
    m1.addFirst(21, "Rahul", "SIT", 124);
    m1.addFirst(22, "Ravi", "SIT", 125);

    m1.showlist();

}


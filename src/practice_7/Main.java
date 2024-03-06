package practice_7;

public class Main {
    public static void main(String[] args) {
        Composite root = new Composite();
        Composite branch1 = new Composite();
        Composite branch2 = new Composite();

        Leaf leaf1 = new Leaf("Leaf 1");
        Leaf leaf2 = new Leaf("Leaf 2");
        Leaf leaf3 = new Leaf("Leaf 3");

        root.add(branch1);
        root.add(branch2);
        root.add(leaf1);

        branch1.add(leaf2);
        branch2.add(leaf3);

        System.out.println("Composite structure:");
        System.out.println(root.getName());
        System.out.println("\t" + branch1.getName());
        System.out.println("\t" + branch2.getName());
        System.out.println("\t" + leaf1.getName());
        System.out.println("\t\t" + leaf2.getName());
        System.out.println("\t\t" + leaf3.getName());
    }
}

package practice_7;

public class ComponentFacade {
    private final Composite composite;

    public ComponentFacade() {
        this.composite = new Composite();
    }

    public void addLeaf(String name) {
        Leaf leaf = new Leaf(name);
        composite.add(leaf);
    }

    public void removeLeaf(String name) {
        for (int i = 0; i < composite.getChildCount(); i++) {
            IComponent component = composite.getChild(i);
            if (component instanceof Leaf && component.getName().equals(name)) {
                composite.remove(component);
                break;
            }
        }
    }

    public String getCompositeName() {
        return composite.getName();
    }

    public String getChildName(int index) {
        if (index >= 0 && index < composite.getChildCount()) {
            return composite.getChild(index).getName();
        } else {
            return null;
        }
    }
}



package practice_5;

//статический класс для ленивой инициализации
public class SingletonHolder {
    private SingletonHolder() {}

    private static class InstanceHolder {
        private static final SingletonHolder instance = new SingletonHolder();
    }

    public static SingletonHolder getInstance() {
        return InstanceHolder.instance;
    }
}
interface Predator {
    String getFood(); // 구현은 인터페이스를 implement한 클래스에서.
}

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal implements Predator {
    public String getFood() { // 인터페이스의 메소드는 항상 public으로 구현한다.
        return "apple";
    }
}

class Lion extends Animal implements Predator {
    public String getFood() {
        return "banana";
    }
}

class ZooKeeper {
    void feed(Predator predator) { // Lion, Tiger 들어올 수 있음. -> 다형성.
        System.out.println("feed "+predator.getFood());
    }
}

package yanot.guru;

public class PetAnimal {
    // Поля класса //
    String name;
    String toy;
    boolean friendliness;
    int nut;
    int reserve;
    boolean play;
    boolean hungry;


    public void getHungry() {
        if (hungry) {
            for (int i = 0; i <= nut; i++)
                reserve = nut - i;
            {
                System.out.println(name + " выдано " + nut);
                System.out.println("ВНИМАНИЕ!!!! " + "У " + name + " " + "остался запас орешков" + " = " + reserve);
            }
        } else {
            System.out.println(name + " " + "не голодна");
        }
    }

    public void getFriendliness() {
        if (nut >= 10) {
            friendliness = true;
            {
                System.out.println(name + " очень дружелюбна ");
            }
        } else {
            System.out.println(name + " совершенно не дружелюбна ");
        }
    }
    public void getPlay() {
        if (friendliness) {
            play = true;
            {
                System.out.println(name + " будет играть с " + toy);
            }
        } else {
            System.out.println(name + " не хочет играть ");
        }
    }
}



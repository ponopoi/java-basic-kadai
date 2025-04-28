package kadai_018;

public abstract class Kato_Chapter18 {
    public String familyName = "加藤";
    public String givenName;
    public String address = "東京都中野区○×"; // 仮の住所

    public void commonIntroduce() {
        System.out.println("私の名前は" + this.familyName + this.givenName + "です。");
        System.out.println("住所は" + this.address + "です。");
    }

    public abstract void eachIntroduce();

    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
    }
}

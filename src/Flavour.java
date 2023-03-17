import java.util.ArrayList;
public class Flavour extends ArrayList<Flower> {
    public int getPackPrice() {
        int sum = 0;
        for (Flower f : this) {
            sum += f.getPrice();
        }
        return sum;
    }

    public void SortByFresh() {
        int[] arrOfFresh = new int[this.size()];
        for (int i = 0; i < this.size(); i++) {
            arrOfFresh[i] = this.get(i).getFreshLevel();
        }
        for (int i = 0; i < this.size(); i++) {
            for (int j = 0; j < this.size()-1; j++) {
                if(arrOfFresh[j+1]<arrOfFresh[j]){
                    int temp = arrOfFresh[j];
                    arrOfFresh[j] = arrOfFresh[j+1];
                    arrOfFresh[j+1] = temp;

                    Flower temp1 = this.get(j);
                    this.set(j,this.get(j+1));
                    this.set(j+1,temp1);
                }
            }
        }
    }
    public void findForLength(int x1, int x2){
        int counter = 0;
        for (Flower item:this) {
            if(item.getLength() > x1 && item.getLength() < x2){
                System.out.println(item);
                counter ++;
            }
        }
        if (counter == 0){
            System.out.println("К сожалению, таких цветов нет");
        }
    }

}



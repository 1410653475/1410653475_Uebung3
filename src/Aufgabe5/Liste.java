package Aufgabe5;

/**
 *
 * @author 1410653475
 * @param <T>
 */
public class Liste<T extends absBenennbar> {
    absBenennbar[] arr;
    
    public Liste(int size){
        arr = new absBenennbar[size];
    }
    
    public void save(T element){
        for(int i =0; i<arr.length;i++){
            if(arr[i] == null){
                arr[i]=element;
                System.out.println("save");
                break;
            }
        }
        
    }
    
    public String toSting(){
        String i="";
        for(absBenennbar a:arr){
            i+=a+"\n";
        }
        return i;
    }
}

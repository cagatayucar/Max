
package max;


public class Max {
    
    static int enbuyukbul(int dizi[]){
        
        
        int i;
        int enbuyuk = dizi[0];
        for(i=0;i<(dizi.length)-1;i++){
            
            if(dizi[i+1]>enbuyuk){
                enbuyuk = dizi[i+1];
            }
            
        }
        return enbuyuk;
    }
    
    public static void main(String[] args) {
        
        int dizi1[] = {2112,31112,245,2344};
        
        System.out.println("Dizinin en buyuk elemanı = " + enbuyukbul(dizi1));
        
        
        
    }
    
}

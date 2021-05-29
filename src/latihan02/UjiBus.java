package latihan02;
public class UjiBus {
    public static void main(String[] arg){
    //membuat objek busMini dari kelas Bus
    Bus busBesar = new Bus(40);
    busBesar.cetak();
    
    //penambahan penumpang
    busBesar.addPenumpang(15);//menambahkan penumpang 15
    busBesar.cetak();
    
    //penambahan penumpang
    busBesar.addPenumpang(5);//menambahkan penumpang 5
    busBesar.cetak();
    
    //penambhan penumpang
    busBesar.addPenumpang(26);//menambahkan penumpang 26
    busBesar.cetak();
    }
}
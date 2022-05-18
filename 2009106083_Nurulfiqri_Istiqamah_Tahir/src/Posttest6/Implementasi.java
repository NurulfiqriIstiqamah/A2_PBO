package Posttest6;

public class Implementasi implements Author {
    
    @Override
    public void ADD(){
        System.out.println("Berhasil ditambahkan");
    }
    
    @Override
    public void EDIT(){
        System.out.println("Berhasil diubah");
    }
    
    @Override
    public void DELETE(){
        System.out.println("Berhasil dihapus");
    }
}

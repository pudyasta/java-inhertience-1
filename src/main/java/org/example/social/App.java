package org.example.social;

public class App 
{
    public static void main( String[] args )
    {
        Person person1 = new Person("Bambang Aji","Jl Kledokan no 122, Sleman");
        Student mahasiswa1 = new Student("Tholib Usman","Dusun Margokaton, Seyegan, Sleman","Teknik Informatika",2022,100000);
        Staff staff1 = new Staff("Burhan Nur","Salakan Lor, Kalasan, Sleman","SMK 2 Depok Sleman",2000000);

        System.out.println("========PERSON========");
        System.out.println(person1.getName());
        System.out.println("Alamat lama : "+person1.getAddress());
        person1.setAddress("JL Kemuning 20, Solo, Jawa Tengah");
        System.out.println("Alamat baru: "+person1.getAddress());
        System.out.println(person1.toString()+"\n");

        System.out.println("========STUDENT========");
        System.out.println(mahasiswa1.getName());
        System.out.println("Alamat lama : "+mahasiswa1.getAddress());
        mahasiswa1.setAddress("JL Solo Km 12");
        System.out.println("Alamat baru: "+mahasiswa1.getAddress());
        System.out.println("Fee lama : "+mahasiswa1.getFee());
        mahasiswa1.setFee(150000);
        System.out.println("Fee baru : "+mahasiswa1.getFee());
        System.out.println("Program lama: "+mahasiswa1.getProgram());
        mahasiswa1.setProgram("Teknik Industri");
        System.out.println("Program baru: "+mahasiswa1.getProgram());
        System.out.println("Tahun lama: "+mahasiswa1.getYear());
        mahasiswa1.setYear(2023);
        System.out.println("Tahun baru: "+mahasiswa1.getYear());
        System.out.println(mahasiswa1.toString()+"\n");


        System.out.println("========STAFF========");
        System.out.println(staff1.getName());
        System.out.println("Alamat lama : "+staff1.getAddress());
        mahasiswa1.setAddress("JL Solo Km 12");
        System.out.println("Alamat baru: "+staff1.getAddress());
        System.out.println("Pay lama : "+staff1.getPay());
        staff1.setPay(150000);
        System.out.println("Pay baru : "+staff1.getPay());
        System.out.println("School lama: "+staff1.getSchool());
        staff1.setSchool("SMK N 2 Yogyakarta");
        System.out.println("School baru: "+staff1.getSchool());
        System.out.println(mahasiswa1.toString()+"\n");
    }
}

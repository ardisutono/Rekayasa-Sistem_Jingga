package com.example.mycrud;

public class konfigurasi {
    public static final String URL_ADD="http://192.168.100.22/Android/Pegawai/tambahPgw.php";
    public static final String URL_GET_ALL = "http://192.168.100.22/Android/Pegawai/tampilSemuaPgw.php";
    public static final String URL_GET_EMP = "http://192.168.100.22/Android/Pegawai/tampilPgw.php?id=";
    public static final String URL_UPDATE_EMP = "http://192.168.100.22/Android/Pegawai/updatePgw.php";
    public static final String URL_DELETE_EMP = "http://192.168.100.22/Android/Pegawai/hapusPgw.php?id=";

    public static final String GET_POSITION = "http://192.168.100.22/Android/Pegawai/ambilPosisi.php";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAMA = "name";
    public static final String KEY_EMP_POSISI = "desg"; //desg itu variabel untuk posisi
    public static final String KEY_EMP_GAJI = "salary"; //salary itu variabel untuk gaji
    public static final String KEY_EMP_GENDER = "gender";

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "name";
    public static final String TAG_POSISI = "desg";
    public static final String TAG_GAJI = "salary";
    public static final String TAG_GENDER = "gender";

    //ID karyawan
    //emp itu singkatan dari Employee
    public static final String EMP_ID = "emp_id";
}

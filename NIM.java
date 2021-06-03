package algoritme;

public class NIM {
    private String nim;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJenjang(){
        char kodeJg = nim.charAt(0);
        if(kodeJg == '1'){
            return "S1 (SARJANA)";
        }else if(kodeJg == '2'){
            return "S2 (MAGISTER)";
        }else if(kodeJg == '3') {
            return "S3 (DOKTOR)";
        }
        return "UNKNOWN";
    }

    public String getTahunMasuk() {
        String kodeTm = nim.substring (1,2);
        if(kodeTm == "19"){
            return "2019";
        }else if(kodeTm == "20"){
            return "2020";
        }else if(kodeTm == "21") {
            return "2021";
        }
        return "UNKNOWN";
    }

    public String getFakultas(){
        char kodeFk = nim.charAt(3);
        if(kodeFk == '1'){
            return "TARBIYAH DAN KEGURUAN";
        }else if(kodeFk == '2'){
            return "SYARIAH DAN HUKUM";
        }else if(kodeFk == '3') {
            return "USHULAUDDIN";
        }else if(kodeFk == '4') {
            return "DAKWAH DAN KOMUNIKASI";
        }else if(kodeFk == '5') {
            return "SAINS DAN TEKNOLOGI";
        } else if(kodeFk == '6') {
            return "PSIKOLOGI";
        }else if(kodeFk == '7') {
            return "EKONOMI DAN IMU SOSIAL";
        }else if(kodeFk == '8'){
            return "PERTANIAN DAN PETERNAKAN";
        }
        return "UNKNOWN";
    }

    public String getJurusan(){
        char kodeJn = nim.charAt(4);
        if(kodeJn == '1'){
            return "Teknik Informatika";
        }else if(kodeJn == '2'){
            return "Teknik Industri";
        }else if(kodeJn == '3'){
            return "Sistem Informasi";
        }else if(kodeJn == '4'){
            return "Matematika";
        }else if(kodeJn == '5'){
            return "Teknik Elektro";
        }
        return "UNKNOWN";
    }

    public String getJenisKelamin(){
        char kodeJk = nim.charAt(6);
        if(kodeJk == '1'){
            return "LAKI-LAKI";
        }else if(kodeJk == '2'){
            return "PEREMPUAN";
        }
        return "UNKNOWN";
    }

    public String getNomorUrutMahasiswa(){
        char kodeNm = nim.charAt(4);
        if(kodeNm == '1'){
            return "Teknik Informatika";
        }else if(kodeNm == '2'){
            return "Teknik Industri";
        }else if(kodeNm == '3'){
            return "Sistem Informasi";
        }else if(kodeNm == '4'){
            return "Matematika";
        }else if(kodeNm == '5'){
            return "Teknik Elektro";
        }
        return "UNKNOWN";
    }


}


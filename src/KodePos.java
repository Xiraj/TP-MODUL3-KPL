public class KodePos {
    private static String CekNama(String nama){
        switch (nama) {
            case "Batununggal":
                return "40266";
            case "Kujangsari":
                return "40287";
            case "Mengger":
                return "40267";
            case "Wates":
                return "40256";
            case "Cijaura":
                return "40287";
            case "Jatisari":
                return "40286";
            case "Margasari":
                return "40286";
            case "Sekejati":
                return "40286";
            case "Kebonwaru":
                return "40272";
            case "Maleer":
                return "40274";
            case "Samoja":
                return "40273";
            default:
                return "NULL";
        }
    }
    public static String getKodePos(String kelurahan) {
        return CekNama(kelurahan);
    }
}

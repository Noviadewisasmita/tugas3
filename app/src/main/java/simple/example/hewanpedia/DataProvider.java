package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Kambing;
import simple.example.hewanpedia.model.Kelinci;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Kambing> initDataKambing(Context ctx) {
        List<Kambing> kambings = new ArrayList<>();
        kambings.add(new Kambing("kambing_kacang", "indonesia",
                "kambing yang paling banyak di temui di indonesia a[alagi banyak di jumpai pada hari raya idul adha selain itu daya tahan tubuh yang kuat sehingga tidak mudah sakit dan perawatan nya sangat mudahbobot hanya mencapai 30 kg sementara kambing betina mancapai 25 kg", R.drawable.ka1));
        kambings.add(new Kambing("kambing_etawa", "indonesia ",
                "kambing etawa di kenal sebagai kambing menghasilkan susu enak dan banyak memiliki ciri khas kakinya pendek tinggi kambing berkisaran antara 127 cm untuk kambing jantan untuk kambing betina tinggi 92 cm", R.drawable.ka2));
        kambings.add(new Kambing("kambing_jawarandu", "indonesia",
                "kambing jawarandu merupakan hasil persilangan dari kambing kacang dengan kambing etawa ukuran nya memiliki bobot seberat 40 kg ciri khas kambing jawaradu adanya tanduk kecil dengan telinga panjang yang jatuh  ", R.drawable.ka3));
        kambings.add(new Kambing("kambing_boer", "afrika_selatan",
                "kambing ini memiliki julukan sebagai kambing sapi bobot kambing boer dewasa bisa mencapai hingga 150 kg  kambing boer memiliki bulu yang pedenk", R.drawable.ka4));
        kambings.add(new Kambing("kambing_kosta", "indonesia",
                "jenis kambing ini banyak di jumpai di daerah jawa barat dan sekitar nya kambing ini hasil kawin silang antara kambing kacang dengan kambing khasmir .", R.drawable.ka5));
        kambings.add(new Kambing("kambing_saanen", "swiss_barat",
                "jenis kambing ini memiliki bulu terbilang pendek dengan bobot yang bisa mencapai 91 kg untuk kambing jantan dan 63 kg untuk kambing betina ", R.drawable.ka6));
        return kambings;
    }
    private static List<Kelinci> initDataKelinci(Context ctx) {
        List<Kelinci> kelincis = new ArrayList<>();
        kelincis.add(new Kelinci("netherland_dwarf", "belanda",
                "kelinci yang berasal dari belanda dengan berat 1,1-2,5 pon,Dwarf belanda adalah satu ras kelinci terkecil ", R.drawable.kelinci_netherland_dwarf));
        kelincis.add(new Kelinci("orictolagus_cuniculus", "eropa",
                "kelinci orictolagus cuniculus juga disebut kelinci eropa atau kelinci domestik adalah satu satunya spesies dalam genusnya", R.drawable.kelinci_orictolagus_cuniculus));
        kelincis.add(new Kelinci("holland_lop", "belanda",
                "kelinci jenis holland lop adalah kelinci yang independent dan playfull", R.drawable.kelinci_holland_lop));
        kelincis.add(new Kelinci("mini_lop", "jerman",
                "Adalah jenis kelinci domestik yang di akui oleh american rabbit association ", R.drawable.kelinci_mini_lop));
        kelincis.add(new Kelinci("raksasa", "belgia",
                "jenis kelinci domestik yang sangat besar,biasanya dianggap sebagai jenis terbesar dari spesiesnya ", R.drawable.kelinci_raksasa));
        kelincis.add(new Kelinci("rex", "prancis",
                "kelinci ini mempunyai tubuh yang besar,telinga yang tegak,dan ciri khas yang menjadikan kelinci rex ini di sukai adalah bulunya yang seperti karpet ", R.drawable.kelinci_rex));
        return kelincis;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataKambing(ctx));
        hewans.addAll(initDataKelinci(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}

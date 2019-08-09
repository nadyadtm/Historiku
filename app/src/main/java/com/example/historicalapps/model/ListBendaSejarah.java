package com.example.historicalapps.model;

import java.util.ArrayList;

public class ListBendaSejarah {
    public static String[][] data = new String[][]{
            {"http://1.bp.blogspot.com/-tBRF96pJkYc/Vem467E9AVI/AAAAAAAAL2k/dUdoLZI-XDE/s1600/DSC_0008.jpg","Menhir","Megalitikum","Sumatra Barat, Gunung Kidul, Sulawesi Tengah, Sulawesi Selatan, Jawa Barat, dan Kalimantan",
                    "Menhir merupakan benda peninggalan praaksara yang berkaitan dengan kepercayaan yang " +
                            "dianut oleh manusia pada masa itu. Menhir ini berbentuk tiang atau tugu terbuat dari batu yang berdiri" +
                            " tegak di atas tanah. Menhir didirikan sebagai sarana menyembah arwah nenek moyang. ","Batu"},
            {"http://1.bp.blogspot.com/-jh-8AVojVcc/Vemw39cmFlI/AAAAAAAAL1g/aJQUhYV7nCo/s1600/arca-perunggu-300x180.jpg","Arca perunggu","Logam","Bangkinang (Riau), Palembang (Sumsel) dan Limbangan (Bogor)",
            "Arca perunggu merupakan patung yang dibuat dengan tujuan utama sebagai media keagamaan yang berfungsi " +
                    "sebagai sarana dalam memuja roh nenek moyang dan media seni rupa. Arca Perunggu memiliki bentuk yang beranekaragam " +
                    "seperti manusia, hewan, atau tumbuhan. Pada umumnya arca perunggu bentuknya kecil-kecil dan dilengkapi cincin " +
                    "pada bagian atasnya","Perunggu"},
            {"http://3.bp.blogspot.com/-nBmZg5kciyo/VekO6Ic-LEI/AAAAAAAALy4/CAp4TWkkTgI/s320/bacbb26b1134c869309de3ffe9a5842a.jpg","Chopper","Zaman Neolithikum","Gombong, Sukabumi, Lahat, Pacitan",
            "Berfungsi untuk menebang kayu, memahat tulang dan sebagai senjata. Kapak perimbas banyak ditemukan di Pacitan" +
                    " provinsi Jawa Timur, sehingga oleh Von Koenigswald disebut alat dari kebudayan pacitan.","Batu"},
            {"http://3.bp.blogspot.com/-4gvKbrFq68w/VekZWwvgLwI/AAAAAAAAL0U/U07KW8wuTMk/s1600/1182866_orig.jpg","Kapak Persegi","Zaman Food Producting","pulau jawa, pulau sumatra, pulau kalimantan dan di pulau nusa tenggara",
            "Kapak ini terbuat dari fuatcepat bahan dasar batu api yang sudah dibuat dengan halus serta di asah. Peninggalan zamam neolitikum (zaman batu muda). Benda tersebut diperkirakan masuk ke wilayah indonesia lewat jalur barat dari " +
                    "yunan ke semenanjung malaka (gelombang ke dua jalur barat). Kapak tersebut berfungsi sebagai lambang " +
                    "kebesaran, alat upacara, alat tukar dan jimat.","Batu Api"},
            {"https://i0.wp.com/hidupsimpel.com/wp-content/uploads/2017/05/Batu-Gandhik.jpg?resize=672%2C400","Pipisan","Zaman Paleolithikum","Langsa (Aceh) dan Medan (Sumatera Utara)",
                    "Pipisan adalah batu-batu Penggiling beserta landasannya. Pipisan ini digunakan " +
                            "tidak hanya untuk menggiling makanan, tetapi juga untuk menghaluskan cat merah seperti yang terlihat dari bekas-bekasnya. Aktivitas ini di perkirakan berkaitan dengan upacara ritual dan kepercayaan.","Batu"},
            {"http://4.bp.blogspot.com/-3C_WbEzxjfI/VMDDbE5V8oI/AAAAAAAAABQ/87dbkg4bZGo/s1600/kjokkenmoddinger.jpg","Kjokkenmoddinger","Zaman Mesolitikum","Pantai Timur Pulau Sumatera",
                    "Kjokkenmoddinger berasal dari bahasa Denmark, Kjokken berarti dapur dan modding artinya sampah. Jadi, kjokkenmoddinger adalah sampah dapur berupa kulit-kulit siput dan kerang yang telah bertumpuk " +
                            "selama beribu-ribu tahun sehingga membentuk sebuah bukit kecil yang beberapa meter tingginya.","Kulit Siput dan Kerang"},
            {"https://i2.wp.com/hidupsimpel.com/wp-content/uploads/2017/05/punden-berundak.jpg?w=800&ssl=1","Punden Berundak","Zaman Megalithikum","Lebak sibedug, Banten Selatan, Leles (Garut) dan Kuningan",
                    "Punden berundak adalah bangunan megalith berupa susunan batu bertingkat sebagai tempat pemujaan terhadap nenek moyang. Peninggalan megalitik ini antara lain ditemukan di Lebak sibedug, Banten Selatan, Leles (Garut) dan Kuningan. Dalam perkembangan selanjutnya punden berundak " +
                            "merupakan dasar bagi pembuatan candi Keraton atau bangunan keagamaan lainnya.","Batu"},
            {"https://kebudayaan.kemdikbud.go.id/bpcbbali/wp-content/uploads/sites/26/2019/01/sarkofagus-atau-peti-batu.jpg","Sarkofagus","Zaman Megalithikum","Bali",
                    " Sarkofagus adalah keranda batu atau peti mayat yang terbuat dari batu. " +
                            "Bentuknya menyerupai lesung dari batu utuh yang diberi tutup. Dari Sarkofagus yang ditemukan" +
                            " umumnya di dalamnya terdapat mayat dan bekal kubur berupa periuk, kapak persegi, perhiasan dan " +
                            "benda-benda dari perunggu serta besi. Daerah tempat ditemukannya sarkofagus adalah Bali. Menurut masyarakat " +
                            "Bali Sarkofagus memiliki kekuatan magis/gaib. Berdasarkan pendapat para ahli bahwa sarkofagus " +
                            "dikenal masyarakat Bali sejak zaman logam.","Batu"},
            {"http://3.bp.blogspot.com/-P8fP2cSqcTg/VMDGReTRZSI/AAAAAAAAAB0/YqeJ9NrPGAU/s1600/mata%2Bpanah.png","Mata Panah","Zaman Neolitikum","Gua Lawa, Gua Gede, Gua petpuruh (Jatim), Gua Cakondo, Gua Tomatoa kacicang, Gua Saripa (sulsel)",
                "Merupakan alat berburu yang sangat urgent. Sealin untuk berburu, mata panah digunakan untuk menangkap ikan, mata panah dibuat bergerigi. Selain terbuat dari batu, mata panah juga terbuat dari tulang.","Batu"},
            {"https://cdn.britannica.com/s:500x350/98/182698-004-F5298EED.jpg","Dolmen","Zaman Megalithikum"," Cupari Kuningan, Bondowoso, Merawan, Jember, Pasemah, dan NTT",
                " Dolmen merupakan meja dari batu yang bermakna sebagai tempat meletakkan saji-sajian untuk pemujaan. Adakalanya di bawah dolmen dipakai untuk meletakkan mayat, agar mayat tersebut " +
                        "tidak dapat dimakan oleh binatang buas maka kaki mejanya diperbanyak sampai mayat tertutup rapat oleh batu. Dengan demikian dolmen yang bermakna sebagai tempat menyimpan " +
                        "mayat disebut dengan kuburan batu.","Batu"}};

    public static ArrayList<BendaSejarah> getListData(){
        ArrayList<BendaSejarah> list=new ArrayList<>();
        for (String[] aData : data){
            BendaSejarah bendaSejarah = new BendaSejarah(aData[0],aData[1],aData[2],aData[3],aData[4],aData[5]);
            list.add(bendaSejarah);
        }
        return list;
    }
}

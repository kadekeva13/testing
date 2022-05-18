package com.example.myapplication;

import android.util.Log;

class QuestionBank {

    public String mQuestions[] = {
            "1.Apakah sejak kejadian itu sering sulit tidur?",
            "2.Apakah waktu tidurmu berkurang?",
            "3.Apakah kamu bisa tidur nyenyak?",
            //"Kategori sulit berkonsetrasi:",
            "4.Apakah di sekolah kamu sulit berkonsentrasi untuk mendengarkan guru",
            "5.Apakah setelah kejadian itu nilai mu turun?",
            "6.Bagaimana minat belajarmu sekarang ini?",
            //"Kategori sulit mengendalikan amarah:",
            "7.Apakah kamu sekarang lebih mudah marah dari biasanya?",
            "8.Apakah kamu mudah tersinggung ketika bermain bersama?",
            "9.Apakah orang disekitarmu sering membuatmu marah?",
            //"Kategori kewaspadaan berlebih:",
            "10.Apakah badanmu terasa sakit ketika teringat peristiwa itu?",
            "11.Apakah kamu berani bermain dengan teman-teman disekolah?",
            "12.Apakah kamu tidak takut pergi kemana-mana?",
            //"Kategori pengalaman berulang:",
            "13.Apakah sering menangis jika teringat ayah ibu?",
            "14.Apakah saat ini sering melamun?",
            "15.Bagaimana perasaanmu ketika teringat ayah ibu?",
            //"Kategori menghindari peristiwa:",
            "16.Apakah kamu bermain dengan teman ketika teringat ayah ibu?",
            "17.Apakah kamu memilih tidur agar tidak teringat ayah ibu?",
            "18.Apakah kamu menghindari teringat ayah ibu dengan melakukan aktivitas lain?",
            //"Kategori mimpi buruk:",
            "19.Apakah sering mengalami mimpi buruk akhir-akhir ini?",
            "20.Apakah tidurmu sering gelisah?",
            "21.Apakah badanmu segar saat bangun?",
            //"Kategori minat aktivitas hilang",
            "22.Apakah setelah kejadian itu masih suka bermain?",
            "23.Apakah setelah kejadian itu masih melakukan hobi sebelumnya?",
            "24.Apakah kegiatanmu sebelumnya berkurang ketika kejadian itu?",
            //"Kategori menarik diri:",
            "25.Apakah lebih suka di kamar saja setelah peristiwa itu?",
            "26.Apakah tetap bersosialisasi dengan teman?",
            "27.Apakah kamu membatasi berbicara dengan orang lain?",
            //"Kategori perasaan bersalah:",
            "28.Apakah kamu merasa bersalah tidak dapat membantu orang tua kamu?",
            "29.Apakah kamu tahu peristiwa tersebut sampai terjadi?",
            "30.Apakah kamu tahu virus covid menyebabkan kematian pada ayah ibu?",
    };

    private String mChoices[][] = {
            {"Tidur saya tidak terganggu", "Tidur saya telat dari biasanya", "Saya tidak bisa tidur sampai larut malam"},
            {"Jam tidur saya tidak berkurang", "Jam tidur saya berkurang 1 jam dari sebelumnya", "Saya baru bisa tidur saat subuh"},
            {"Saya bisa tidur nyenyak", "Perlu pendamping untuk bisa tidur nyenyak", "Setiap hari saya tidak bisa tidur nyenyak"},
            {"Saya masih bisa berkonsentrasi","Saya masih bisa berkonsentrasi ketika duduk di depan saja","Setelah kejadian itu saya sulit berkonsentrasi meskipun sudah duduk di depan"},
            {"Nilai saya tetap sama seperti dahulu","Nilai saya turun hanya di beberapa pelajaran","Nilai saya turun di semua mata pelajaran"},
            {"Saya masih minat belajar seperti dulu","Saya berminat belajar ketika didampingi orang terdekat","Saya kehilangan minat belajar"},
            {"Saya tidak mudah marah","Saya lebih mudah marah karna kesalahan kecil","Saya menjadi lebih pemarah dari dulu"},
            {"Saya tidak mudah tersinggung oleh teman ketika bermain","Saya lebih mudah tersinggung kepada teman yang belum akrab saja","Saya mudah tersinggung dengan semua teman"},
            {"Orang di sekitar saya tidak sering membuat saya marah","Orang di sekitar saya sering melakukan kesalahan kecil yang membuat saya marah","Orang di sekitar saya selalu membuat saya marah setiap hari"},
            {"Badanku tidak bereaksi ketika teringat peristiwa itu","Kepalaku terasa pusing ketika mengingat kejadian itu","Jantungku berdebar dan sesak nafas ketika teringat peristiwa itu"},
            {"Saya bermain seperti biasa dengan teman saya","Saya hanya bermain dengan beberapa teman saja","Saya tidak berani bermain dengan teman saya ketika teringat peristiwa itu"},
            {"Saya tidak takut pergi kemana-mana","Saya berani pergi jika ditemani","Saya tidak berani pergi kemana meskipun ditemani"},
            {"Ketika teringat saya biasa saja","Saya menangis ketika teringat ayah ibu","Saya menangis histeris ketika teringat ayah ibu"},
            {"Saya tidak pernah melamun","Saya melamun di waktu tertentu","Saya sering melamun"},
            {"Perasaan saya hanya rindu","Perasaan saya sedih","Perasaan saya sakit dan menyalahkan diri sendiri"},
            {"Saya bermain seperti biasa dengan teman","Saya tetap bermain tetapi tidak lupa waktu tapi saya tetap bisa belajar","Saya akan bermain seharian agar tidak teringat ayah ibu"},
            {"Saya tidur dengan jam tidur seperti dulu","Saya tidur hanya ketika teringat saja","Saya memilih tidur seharian agar tidak teringat"},
            {"Saya beraktivitas seperti biasa","Saya masih teringat ketika beraktivitas","Saya tidak melakukan aktivitas dan terus teringat ayah ibu"},
            {"Saya tidak mengalami mimpi buruk akhir-akhir ini","Saya mengalami mimpi buruk di beberapa malam saja","Saya mengalami mimpi buruk setiap hari"},
            {"Saya tidur dengan normal","Saya merasa gelisah di jam-jam tertentu","Saya selalu gelisah ketika tidur"},
            {"Badan saya segar saat bangun","Badan saya sedikit capek ketika bangun","Badan saya tidak segar sama sekali"},
            {"Saya masih suka bermain","Saya bermain ketika ingin bermain","Saya tidak bermain lagi setelah peristiwa itu"},
            {"Saya masih melakukan hobi saya","Saya masih melakukan sebagian hobi saya","Saya tidak pernah melakukan hobi saya setelah peristiwa itu"},
            {"Kegiatan saya tidak berkurang","Sebagian kegiatan saya berkurang","Saya mengurangi semua kegiatan saya dan mengurung diri"},
            {"Saya masih berkegiatan di luar kamar","Kegiatan saya kebanyakan di kamar","Setiap hari saya hanya di kamar"},
            {"Saya masih memiliki banyak teman dan bermain dengan teman setelah peristiwa itu","Saya masih memiliki banyak teman dan bermain dengan teman terdekat saja","Setelah kejadian itu saya tidak bersosialisasi lagi"},
            {"Saya berbicara dengan siapa saja","Saya berbicara dengan orang terdekat saja","Saya tidak berbicara dengan siapapun"},
            {"Saya tidak menyalahkan diri saya sendiri","Saya kadang masih menyalahkan diri sendiri","Saya terus-terusan menyalahkan diri sendiri"},
            {"Saya tahu peristiwa tersebut akan terjadi","Saya tahu peristiwa tersebut terjadi tetapi saya tidak menduga","Saya tahu peristiwa itu terjadi atas kesalahan saya"},
            {"Saya tidak tahu virus dapat menyebabkan kematian","Saya tahu virus dapat menyebabkan kematian","Saya tahu virus dapat menyebabkan kematian tetapi saya tidak bisa menolongnya"},

    };

    private String mCorrectAnswer[] = {
            "Tidur saya tidak terganggu",
            "Jam tidur saya tidak berkurang",
            "Saya bisa tidur nyenyak",
            "Saya masih bisa berkonsentrasi",
            "Nilai saya tetap sama seperti dahulu",
            "Saya masih minat belajar seperti dulu",
            "Saya tidak mudah marah",
            "Saya tidak mudah tersingung oleh teman ketika bermain",
            "Orang di sekitar saya tidak sering membuat saya marah",
            "Badanku tidak bereaksi ketika teringat peristiwa itu",
            "Saya bermain seperti biasa dengan teman saya",
            "Saya tidak takut pergi kemana-mana",
            "Ketika teringat saya biasa saja",
            "Saya tidak pernah melamun",
            "Perasaan saya hanya rindu",
            "Saya bermain seperti biasa dengan teman",
            "Saya tidur dengan jam tidur seperti dulu",
            "Saya beraktivitas seperti biasa",
            "Saya tidak mengalami mimpi buruk akhir-akhir ini",
            "Saya tidur dengan normal",
            "Badan saya segar saat bangun",
            "Saya masih suka bermain",
            "Saya masih melakukan hobi saya",
            "Kegiatan saya tidak berkurang",
            "Saya masih berkegiatan di luar kamar",
            "Saya masih memiliki banyak teman dan bermain dengan teman setelah peristiwa itu",
            "Saya berbicara dengan siapa saja",
            "Saya tidak menyalahkan diri saya sendiri",
            "Saya tahu peristiwa tersebut akan terjadi",
            "Saya tidak tahu virus dapat menyebabkan kematian",
    };

    private String mResults[][] = {
            {"Kategori Stress Ringan : Anak tetap bermain dengan teman", "Anak dapat bercerita dengan teman di sekitarnya", "Anak dapat melakukan kegiatan yang di sukainya"},
            {"Kategori Stress Sedang : Psikolog memberikan edukasi pendampingan pada anak untuk mendampingi anak sesuai dengan kondisi anak"},
            {"Kategori Stress Berat : Psikolog melakukan konseling pada anak untuk membantu mengurangi trauma anak"},
    };

    public int getLength() {
        return mQuestions.length;
    }

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice(int a, int num) {
        String choice = mChoices[a][num-1];
        return choice;
    }

    public String getCorrectionAnswer(int a) {
        String answer = mCorrectAnswer[a];
        return answer;
    }

    public String getConclusion(float num) {
        Log.d("QuestNum", String.valueOf(num));
        String conclusion = "";
        if (num >= 0.7) {
            conclusion = "ringan";
        } else if (num >= 0.5) {
            conclusion = "sedang";
        } else if (num >= 0.25) {
            conclusion = "berat";
        } else {
            conclusion = "berat";
        }
        return conclusion;
    }

    public String[] getResult(String conclusion) {
        String[] result = new String[0];
        if (conclusion.equals("ringan")) {
            result = mResults[0];
        } else if (conclusion.equals("sedang")) {
            result = mResults[1];
        } else if (conclusion.equals("berat")) {
            result = mResults[2];
        }
        return result;
    }
}

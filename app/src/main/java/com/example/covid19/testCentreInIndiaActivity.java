package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class testCentreInIndiaActivity extends AppCompatActivity {
    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_centre_in_india);
        listView = (ExpandableListView)findViewById(R.id.lvExp);
        initData();
        listAdapter = new ExpandableListAdapter(this,listDataHeader,listHash);
        listView.setAdapter(listAdapter);
    }

    private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("Andhra Pradesh");
        listDataHeader.add("Assam");
        listDataHeader.add("Bihar");
        listDataHeader.add("Chandigarh");
        listDataHeader.add("Chattisgarh");
        listDataHeader.add("Delhi");
        listDataHeader.add("Gujarat");
        listDataHeader.add("Haryana");
        listDataHeader.add("Himachal Pradesh");
        listDataHeader.add("Jammu & Kashmir");
        listDataHeader.add("Jharkhand");
        listDataHeader.add("Karnataka");
        listDataHeader.add("Kerela");
        listDataHeader.add("Maharastra");
        listDataHeader.add("Madhya Pradesh");
        listDataHeader.add("Manipur");
        listDataHeader.add("Meghalaya");
        listDataHeader.add("Odisha");
        listDataHeader.add("Puducherry");
        listDataHeader.add("Punjab");
        listDataHeader.add("Rajasthan");
        listDataHeader.add("Tamil Nadu");
        listDataHeader.add("Telangana");
        listDataHeader.add("Tripura");
        listDataHeader.add("Uttar Pradesh");
        listDataHeader.add("Uttarakhand");
        listDataHeader.add("West Bengal");
        listDataHeader.add("Andaman & Nicobar Island");



        List<String> AndhraPradesh = new ArrayList<>();
        AndhraPradesh.add("1. Sri Venkateswara Institute Of Medical Sciences,Tirupati(Govt)");
        AndhraPradesh.add("2. Rangaraya Medical College,Kaninada(Govt)");
        AndhraPradesh.add("3. Sidhartha Medical College,Vijaywada(Govt)");
        AndhraPradesh.add("4. Govt. Medical College,Ananthpur(Govt)");


        List<String> Assam = new ArrayList<>();
        Assam.add("Gauhati Medical College,Guwahati(Govt)");
        Assam.add("Regional Medical Research Center,Dibrugarh(Govt)");
        Assam.add("Jorhat Medical College,Jorhat(Govt)");
        Assam.add("Silchar Medical College,Silchar(Govt)");


        List<String> Bihar = new ArrayList<>();
        Bihar.add("Rajendra Memorial Research Institute Of Medical Sciences,Patna(Govt)");
        Bihar.add("Indira Gandhi Institute Medical Sciences,Patna(GOVT)");


        List<String> Chandigarh = new ArrayList<>();
        Chandigarh.add("Post Graduate Institute Of Medical Education & Research,Chandigarh(Govt)");
        Chandigarh.add("Govt. Medical College,Chandigarh(Govt)");



        List<String> Chattisgarh = new ArrayList<>();
        Chattisgarh.add("All India Institute Of Medical Sciences,Raipur(Govt)");
        Chattisgarh.add("Late Baliram Kashyap M Govt. Medical College,jagdalpur(Govt)");


        List<String> Delhi= new ArrayList<>();
        Delhi.add("All India Institute Medical Sciences,Delhi(Govt)");
        Delhi.add("Lady Hardinge Medical College(Govt)");
        Delhi.add("National Centre For Disease Control,Delhi(Govt)");
        Delhi.add("Ram Manohar Lohia Hospital,Delhi(Govt)");
        Delhi.add("Institute Of Liver & Biliary Sciences,Delhi(Govt)");
        Delhi.add("Army Hospital Research & Referral,Delhi(Govt)");


        List<String> Gujarat = new ArrayList<>();
        Gujarat.add("BJ Medical College,Ahmedabad(Govt)");
        Gujarat.add("MP Shah Govt Medical College,Jamnagar(Govt)");
        Gujarat.add("Govt. Medical College,Surat(Govt)");
        Gujarat.add("Govt. Medical College,Bhavnagar(Govt)");
        Gujarat.add("Govt. Medical College,Vadodara(Govt)");


        List<String> Haryana = new ArrayList<>();
        Haryana.add("Pt. B.D. Sharma Post Graduate Inst. Of Med. Sciences,Rohtak(Govt)");
        Haryana.add("BPS Govt. Medical College,Sonipat(Govt)");


        List<String> HimachalPradesh = new ArrayList<>();
        HimachalPradesh.add("Indira Gandhi Medical College,Shimla(Govt)");
        HimachalPradesh.add("Dr. Rajendra Prasad Govt. Medical College,Tanda(Govt)");


        List<String> Jammu_Kashmir = new ArrayList<>();
        Jammu_Kashmir.add("Govt. Medical College,Jammu(Govt)");
        Jammu_Kashmir.add("Command Hospital (NC),Udhampur(Govt)");
        Jammu_Kashmir.add("Sher-I-Kashmir Institute Of Medical Sciences,Srinagar(Govt)");
        Jammu_Kashmir.add("Govt. Medical College,Srinagar(Govt)");


        List<String> Jharkhand = new ArrayList<>();
        Jharkhand.add("MGM Medical College & Hospital,Jamshedpur(Govt)");
        Jharkhand.add("Rajendra Institute Of Medical Sciences,Ranchi(Govt)");


        List<String> Karnataka = new ArrayList<>();
        Karnataka.add("Hassan Inst. Of Med. Sciences,Hassan(Govt)");
        Karnataka.add("Mysore Medical College & Research Institute,Mysore(Govt)");
        Karnataka.add("Shimoga Instt. Of Medical Sciences,Shoivamoga(Govt");
        Karnataka.add("Command Hospital (Air Force),Bengaluru(Govt)");
        Karnataka.add("Bangalore Medical College & Research Institute,Bengaluru(Govt)");
        Karnataka.add("National Institute Of Virology, Bangalore Field Unit,Bengaluru(Govt)");
        Karnataka.add("Gulbarga Institute Of Medical Sciences,Gulbarga(Govt)");


        List<String> Kerela = new ArrayList<>();
        Kerela.add("National Institute Of Virology Field Unit,Allapuzzha(Govt)");
        Kerela.add("Govt. Medical College,Thiruvanathapuram(Govt)");
        Kerela.add("Govt. Medical College,Kozhikode(Govt)");
        Kerela.add("Govt. Medical College,Thrissur");
        Kerela.add("Rajiv Gandhi Center For Biotechnology,Thiruvanathapuram(Govt)");
        Kerela.add("Sree Chitra Tirunal Institute Of Medical Sciences,Thiruvanathpuram(Govt)");
        Kerela.add("State Public Health Laboratory,Trivandrum(Govt)");
        Kerela.add("Interuniversity,Kottayum(Govt)");



        List<String> Maharastra = new ArrayList<>();
        Maharastra.add("National Institute Of Virology,Pune(Govt)");
        Maharastra.add("Seth GS Medical College & KEM Hospital,Mumbai(Govt)");
        Maharastra.add("Kasturba Hospital For Infectious Diseases,Mumbai(Govt)");
        Maharastra.add("National Institute Of Virology Field Unit,Mumbai(Govt)");
        Maharastra.add("Armed Forces Medical College,Pune(Govt)");
        Maharastra.add("BJ Medical College,Pune(Govt)");
        Maharastra.add("Indira Gandhi Govt. Medical College,Nagpur(Govt)");
        Maharastra.add("Grant Medical College & Sir JJ Hospital,Mumbai(Govt)");


        List<String> Madhya_Pradesh = new ArrayList<>();
        Madhya_Pradesh.add("All India Institute Of Medical Sciences,Bhopal(Govt)");
        Madhya_Pradesh.add("National Institute For Research On Tribal Health,Jabalpur(Govt)");
        Madhya_Pradesh.add("Mahatma Gandhi Memorial Medical College,Indore(Govt)");
        Madhya_Pradesh.add("Gandhi Medical College,Bhopal(Govt)");


        List<String> Manipur = new ArrayList<>();
        Manipur.add("Jawaharlal Nehru Institute Of Med. Sciences,Imphal-East(Govt)");
        Manipur.add("Regional Institute Of Medical Sciences,Imphal(Govt)");


        List<String> Meghalaya = new ArrayList<>();
        Meghalaya.add("North Eastern Indira Gandhi Regional Institute Of Health & Medical Sciences,Shillong(Govt)");


        List<String> Odisha = new ArrayList<>();
        Odisha.add("Regional Medical Research Centre,Bhubaneshwar(Govt)");
        Odisha.add("All India Institute Of Medical Sciences,Bhubaneshwar(Govt)");


        List<String> Puducherry = new ArrayList<>();
        Puducherry.add("Jawaharlal Institute Of Postgraduate Medical Education & Research,Puducherry(Govt)");


        List<String> Punjab = new ArrayList<>();
        Punjab.add("Govt. Medical College,Amritsar(Govt)");
        Punjab.add("Govt. Medical College,Punjab(Govt)");


        List<String> Rajasthan = new ArrayList<>();
        Rajasthan.add("Sawai Man Singh Medical College,Jaipur(Govt)");
        Rajasthan.add("Dr. Sampurnanand Medical College,Jodhpur(Govt)");
        Rajasthan.add("Jhalawar Medical College,Jhalawar(Govt)");
        Rajasthan.add("RNT Medical College,Udaipur(Govt)");
        Rajasthan.add("SP Medical College,Bikaner(Govt)");
        Rajasthan.add("All India Institute Of Medical Sciences,Jodhpur(Govt)");
        Rajasthan.add("JLN Medical College,Ajmer(Govt)");
        Rajasthan.add("Govt. Medical College,Kota(Govt)");


        List<String> Tamil_Nadu = new ArrayList<>();
        Tamil_Nadu.add("King Institute Of Preventive Medicine & Research,Chennai(Govt)");
        Tamil_Nadu.add("Madras Medical College,Chennai(Govt)");
        Tamil_Nadu.add("Govt. Theni Medical College,Theni(Govt)");
        Tamil_Nadu.add("Tirunelveli Medical College,Tirunelveli(Govt)");
        Tamil_Nadu.add("Govt. Medical College,Thiruvarur(Govt)");
        Tamil_Nadu.add("Kumar Mangalam Govt. Medical College,Salem(Govt)");
        Tamil_Nadu.add("Coimbatore Medical College,Coimbatore(Govt)");


        List<String> Telangana = new ArrayList<>();
        Telangana.add("Gandhi Medical College,Secunderabad(Govt)");
        Telangana.add("Osmania Medical College,Hyderabad(Govt)");
        Telangana.add("Sir Ronald Ross Of Tropical & Communicable Diseases,Hyderabad(govt)");
        Telangana.add("Nizam’s Institute Of Medical Sciences,Hyderabad(Govt)");

        List<String> Tripura = new ArrayList<>();
        Tripura.add("Government Medical College,Agartala(Govt)");


        List<String> Uttar_Pradesh = new ArrayList<>();
        Uttar_Pradesh.add("King George Medical University,Lucknow(Govt)");
        Uttar_Pradesh.add("Institute Of Medical Sciences, Banaras Hindu University,Varanasi(Govt)");
        Uttar_Pradesh.add("Jawaharlal Nehru Medical College,Aligarh(Govt)");
        Uttar_Pradesh.add("Command Hospital,Lucknow(Govt)");
        Uttar_Pradesh.add("Lala Lajpat Rai Memorial Medical College,Meerut(Govt)");
        Uttar_Pradesh.add("Sanjay Gandhi Post Graduate Institute,Lucknow(Govt)");
        Uttar_Pradesh.add("Uttar Pradesh RIMS,Saifai(Govt)");
        Uttar_Pradesh.add("Regional Medical Research Centre,Gorakhpur(Govt)");

        List<String> Uttarakhand = new ArrayList<>();
        Uttarakhand.add("Govt. Medical College,Haldwani(Govt)");

        List<String> West_Bengal = new ArrayList<>();
        West_Bengal.add("National Institute Of Cholera & Enteric Diseases,Kolkata(Govt)");
        West_Bengal.add("Institute Of Post Graduate Medical Education & Research,Kolkata(Govt)");
        West_Bengal.add("Midnapore Medical College,Midnapore(Govt)");
        West_Bengal.add("North Bengal Medical College,Darjeeling(Govt)");

        List<String> Andaman_Nicobar = new ArrayList<>();
        Andaman_Nicobar.add("Regional Medical Research Centre,Port Blair(Govt)");



        listHash.put(listDataHeader.get(0),AndhraPradesh);
        listHash.put(listDataHeader.get(1),Assam);
        listHash.put(listDataHeader.get(2),Bihar);
        listHash.put(listDataHeader.get(3),Chandigarh);
        listHash.put(listDataHeader.get(4),Chattisgarh);
        listHash.put(listDataHeader.get(5),Delhi);
        listHash.put(listDataHeader.get(6),Gujarat);
        listHash.put(listDataHeader.get(7),Haryana);
        listHash.put(listDataHeader.get(8),HimachalPradesh);
        listHash.put(listDataHeader.get(9),Jammu_Kashmir);
        listHash.put(listDataHeader.get(10),Jharkhand);
        listHash.put(listDataHeader.get(11),Karnataka);
        listHash.put(listDataHeader.get(12),Kerela);
        listHash.put(listDataHeader.get(13),Maharastra);
        listHash.put(listDataHeader.get(14),Madhya_Pradesh);
        listHash.put(listDataHeader.get(15),Manipur);
        listHash.put(listDataHeader.get(16),Meghalaya);
        listHash.put(listDataHeader.get(17),Odisha);
        listHash.put(listDataHeader.get(18),Puducherry);
        listHash.put(listDataHeader.get(19),Punjab);
        listHash.put(listDataHeader.get(20),Rajasthan);
        listHash.put(listDataHeader.get(21),Tamil_Nadu);
        listHash.put(listDataHeader.get(22),Telangana);
        listHash.put(listDataHeader.get(23),Tripura);
        listHash.put(listDataHeader.get(24),Uttar_Pradesh);
        listHash.put(listDataHeader.get(25),Uttarakhand);
        listHash.put(listDataHeader.get(26),West_Bengal);
        listHash.put(listDataHeader.get(27),Andaman_Nicobar);





    }

    }

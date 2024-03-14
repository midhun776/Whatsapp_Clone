package com.example.firstinternal.model

import com.example.firstinternal.R

object SampleData {
    val statusDemo = listOf(
        StatusItemModel("Midhun",R.drawable.img1, R.drawable.status1),
        StatusItemModel("Civiya",R.drawable.img2, R.drawable.status2),
        StatusItemModel("Nazim",R.drawable.img3, R.drawable.status3),
        StatusItemModel("Athulya",R.drawable.kartha, R.drawable.status2),
        StatusItemModel("Anwar",R.drawable.img4, R.drawable.status4),
        StatusItemModel("Dony",R.drawable.img5, R.drawable.status4),
        StatusItemModel("Aswin",R.drawable.img1, R.drawable.status2),
    )

    val channelDemo = listOf(
        ChannelItemModel( "Asianet News",
            "Thiruvananthapuram: A section of Congress leaders from Thiruvananthapuram district will join the BJP today. The BJP leadership has announced that the leaders will join the party in a press conference called at 11 am. But BJP has kept the information of who is in suspense. Last day BJP state president K. Surendran had claimed that leaders from left and right fronts will join the BJP. Following this, the party leadership announced yesterday evening that more Congress leaders will join the BJP. Padmaja Venugopal joining the BJP comes at a time when the Lok Sabha elections are a big debate and more leaders are joining the BJP. Rashtriya Kerala is looking forward to see if the new leaders joining the party will become prominent.",
            R.drawable.asianet,
            R.drawable.desc,),
        ChannelItemModel("Mathrubhumi News",
            "Kalaburagi: Congress President M Mallikarjun Kharge on Wednesday indicated that the party is facing funds crunch alleging that bank accounts where mon...",
            R.drawable.mathrubhumi,
            R.drawable.mdesc),
    )

    val findDemo = listOf(
        FindItemModel("Mumbai Indians",R.drawable.mumbai),
        FindItemModel("CSK",R.drawable.csk),
        FindItemModel("Mohanlal",R.drawable.mohanlal)
    )

    val allChannelsDemo = listOf(
        AllChannelModel(R.drawable.mumbai,"Mumbai Indians","13.9M followers"),
        AllChannelModel(R.drawable.csk,"Chennai Super Kings","11M followers"),
        AllChannelModel(R.drawable.mohanlal,"Mohanlal","15.7M followers")
    )

    val tabsDemo = listOf(
        TabsItemModel("Explore"),
        TabsItemModel("More Active"),
        TabsItemModel("Popular"),
        TabsItemModel("New"),
        TabsItemModel("India"),
    )
}
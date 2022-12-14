package com.example.smartclouds;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link OrnamentFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OrnamentFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public OrnamentFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DesignFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static OrnamentFragment newInstance(String param1, String param2) {
        OrnamentFragment fragment = new OrnamentFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] maintitle ={
                "Palomino Bunny Decor",
                "L.E.D. Black Tree",
                "Champagne Apple Set of 4",
                "Aryla Pebbles",
                "Smog T-Light – Large",
                "Casper Pumpkin",
                "White Carambola",
                "Ceramic Lemon",
                "Aurel White Disc",
                "Lynx Chain Sculpture",
                "Sophie Chain Sculpture",
                "Olive Artichoke Flower",
                "Gala Apple & Pear Set",
                "Butterflies Cloche",
                "Botanist Moss",
                "Cayenne Shell Decor – Small"
        };

        String[] subtitle ={
                "A statement intricate cream shell decor ornament on a black metal stand, finished with a natural rope centre. The shell circle adds subtle depth and an interesting texture to the room and is a charming addition to any console, desk or bookshelf, whether displayed alone or styled in a set with our other decorative discs.\n" +
                        "\n" +
                        "Dimensions: H: 29 x W: 23 x D: 8 CM",
                "A statement intricate cream shell decor ornament on a black metal stand, finished with a natural rope centre. The shell circle adds subtle depth and an interesting texture to the room and is a charming addition to any console, desk or bookshelf, whether displayed alone or styled in a set with our other decorative discs.\n" +
                        "\n" +
                        "Dimensions: H: 29 x W: 23 x D: 8 CM",
                "A statement intricate cream shell decor ornament on a black metal stand, finished with a natural rope centre. The shell circle adds subtle depth and an interesting texture to the room and is a charming addition to any console, desk or bookshelf, whether displayed alone or styled in a set with our other decorative discs.\n" +
                        "\n" +
                        "Dimensions: H: 29 x W: 23 x D: 8 CM",
                "A statement intricate cream shell decor ornament on a black metal stand, finished with a natural rope centre. The shell circle adds subtle depth and an interesting texture to the room and is a charming addition to any console, desk or bookshelf, whether displayed alone or styled in a set with our other decorative discs.\n" +
                        "\n" +
                        "Dimensions: H: 29 x W: 23 x D: 8 CM",
                "A statement intricate cream shell decor ornament on a black metal stand, finished with a natural rope centre. The shell circle adds subtle depth and an interesting texture to the room and is a charming addition to any console, desk or bookshelf, whether displayed alone or styled in a set with our other decorative discs.\n" +
                        "\n" +
                        "Dimensions: H: 29 x W: 23 x D: 8 CM",
                "A statement intricate cream shell decor ornament on a black metal stand, finished with a natural rope centre. The shell circle adds subtle depth and an interesting texture to the room and is a charming addition to any console, desk or bookshelf, whether displayed alone or styled in a set with our other decorative discs.\n" +
                        "\n" +
                        "Dimensions: H: 29 x W: 23 x D: 8 CM",
                "A statement intricate cream shell decor ornament on a black metal stand, finished with a natural rope centre. The shell circle adds subtle depth and an interesting texture to the room and is a charming addition to any console, desk or bookshelf, whether displayed alone or styled in a set with our other decorative discs.\n" +
                        "\n" +
                        "Dimensions: H: 29 x W: 23 x D: 8 CM",
                "A statement intricate cream shell decor ornament on a black metal stand, finished with a natural rope centre. The shell circle adds subtle depth and an interesting texture to the room and is a charming addition to any console, desk or bookshelf, whether displayed alone or styled in a set with our other decorative discs.\n" +
                        "\n" +
                        "Dimensions: H: 29 x W: 23 x D: 8 CM",
                "A statement intricate cream shell decor ornament on a black metal stand, finished with a natural rope centre. The shell circle adds subtle depth and an interesting texture to the room and is a charming addition to any console, desk or bookshelf, whether displayed alone or styled in a set with our other decorative discs.\n" +
                        "\n" +
                        "Dimensions: H: 29 x W: 23 x D: 8 CM",
                "A statement intricate cream shell decor ornament on a black metal stand, finished with a natural rope centre. The shell circle adds subtle depth and an interesting texture to the room and is a charming addition to any console, desk or bookshelf, whether displayed alone or styled in a set with our other decorative discs.\n" +
                        "\n" +
                        "Dimensions: H: 29 x W: 23 x D: 8 CM",
                "A statement intricate cream shell decor ornament on a black metal stand, finished with a natural rope centre. The shell circle adds subtle depth and an interesting texture to the room and is a charming addition to any console, desk or bookshelf, whether displayed alone or styled in a set with our other decorative discs.\n" +
                        "\n" +
                        "Dimensions: H: 29 x W: 23 x D: 8 CM",
                "A statement intricate cream shell decor ornament on a black metal stand, finished with a natural rope centre. The shell circle adds subtle depth and an interesting texture to the room and is a charming addition to any console, desk or bookshelf, whether displayed alone or styled in a set with our other decorative discs.\n" +
                        "\n" +
                        "Dimensions: H: 29 x W: 23 x D: 8 CM",
                "A statement intricate cream shell decor ornament on a black metal stand, finished with a natural rope centre. The shell circle adds subtle depth and an interesting texture to the room and is a charming addition to any console, desk or bookshelf, whether displayed alone or styled in a set with our other decorative discs.\n" +
                        "\n" +
                        "Dimensions: H: 29 x W: 23 x D: 8 CM",
                "A statement intricate cream shell decor ornament on a black metal stand, finished with a natural rope centre. The shell circle adds subtle depth and an interesting texture to the room and is a charming addition to any console, desk or bookshelf, whether displayed alone or styled in a set with our other decorative discs.\n" +
                        "\n" +
                        "Dimensions: H: 29 x W: 23 x D: 8 CM",
                "A statement intricate cream shell decor ornament on a black metal stand, finished with a natural rope centre. The shell circle adds subtle depth and an interesting texture to the room and is a charming addition to any console, desk or bookshelf, whether displayed alone or styled in a set with our other decorative discs.\n" +
                        "\n" +
                        "Dimensions: H: 29 x W: 23 x D: 8 CM",
                "A statement intricate cream shell decor ornament on a black metal stand, finished with a natural rope centre. The shell circle adds subtle depth and an interesting texture to the room and is a charming addition to any console, desk or bookshelf, whether displayed alone or styled in a set with our other decorative discs.\n" +
                        "\n" +
                        "Dimensions: H: 29 x W: 23 x D: 8 CM"

        };

        Integer[] imgid={
                R.drawable.bunny,
                R.drawable.tree,
                R.drawable.apple_sets,
                R.drawable.arya_pebles,
                R.drawable.smog,
                R.drawable.pumpkin,
                R.drawable.carambola,
                R.drawable.lemon,
                R.drawable.disk,
                R.drawable.chain,
                R.drawable.olive,
                R.drawable.gala,
                R.drawable.butterfly,
                R.drawable.moss,
                R.drawable.cayenne,
                R.drawable.carambola
        };
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_design, container, false);
        ListAdapter adapter = new ListAdapter(this.getActivity(), maintitle, subtitle,imgid);
        ListView list = (ListView) view.findViewById(R.id.listView);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                // TODO Auto-generated method stub
//                String
               Intent intent = new Intent(getContext(), SingleItem.class);
//                prepare data to pass to next details activitity
                intent.putExtra("title", maintitle[position]);
                intent.putExtra("subtitle", subtitle[position]);
                intent.putExtra("image", imgid[position]);
                startActivity(intent);

            }
        });
        return view;
    }
}
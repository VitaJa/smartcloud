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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link OrnamentFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DesignFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DesignFragment() {
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
                "Ashley Campbell Interior Design",
                "The Remodeling Company",
                "Atwood: Fine Architectural Cabinetry",
                "KLC Decking and Outdoor Living",
                "Pacific Coast Builders, Inc.",
                "Mark Langos Interior Design",
                "Pure Builders Inc.",
                "BuildAppeal Design & Build",
                "Ashley Campbell Interior Design",
                "The Remodeling Company",
                "Atwood: Fine Architectural Cabinetry",
                "KLC Decking and Outdoor Living",
                "Pacific Coast Builders, Inc.",
                "Mark Langos Interior Design",
                "Pure Builders Inc.",
                "BuildAppeal Design & Build"
        };

        String[] subtitle ={
                "Beth Singer Photographer Trendy dark wood floor and brown floor dining roo",
                "This living room, which opens to the kitchen, has everything you need. Plenty of built-ins to display a",
                "Like the musical Rhapsody in Blue, by George Gershwin, this kitchen is a culmination of classical",
                "Custom Fireplace with gas loges Large elegant backyard concrete paver patio photo",
                "Inspiration for a mid-sized contemporary wooden",
                "Example of a farmhouse backyard concrete paver",
                "No kids bathroom is complete without a shower tub combo",
                "This master bathroom has elegance luxury and modern style with classic elements",
                "Beth Singer Photographer Trendy dark wood floor and brown floor dining roo",
                "This living room, which opens to the kitchen, has everything you need. Plenty of built-ins to display a",
                "Like the musical Rhapsody in Blue, by George Gershwin, this kitchen is a culmination of classical",
                "Custom Fireplace with gas loges Large elegant backyard concrete paver patio photo",
                "Inspiration for a mid-sized contemporary wooden",
                "Example of a farmhouse backyard concrete paver",
                "No kids bathroom is complete without a shower tub combo",
                "This master bathroom has elegance luxury and modern style with classic elements"
        };

        Integer[] imgid={
                R.drawable.ashley,
                R.drawable.remodelling,
                R.drawable.atwood,
                R.drawable.ashley,
                R.drawable.mark_langos,
                R.drawable.pacific_coast_builders,
                R.drawable.pure_builders,
                R.drawable.buildappeal,
                R.drawable.ashley,
                R.drawable.remodelling,
                R.drawable.atwood,
                R.drawable.ashley,
                R.drawable.mark_langos,
                R.drawable.pacific_coast_builders,
                R.drawable.pure_builders,
                R.drawable.buildappeal
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
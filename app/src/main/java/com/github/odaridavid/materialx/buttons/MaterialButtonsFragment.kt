/**
 *
 * Copyright 2020 David Odari
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *            http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 **/
package com.github.odaridavid.materialx.buttons

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.github.odaridavid.materialx.R
import com.google.android.material.button.MaterialButtonToggleGroup


internal class MaterialButtonsFragment : Fragment(R.layout.fragment_material_buttons) {

    private lateinit var materialButtonToggleGroup: MaterialButtonToggleGroup
    private val materialButtonToggleGroupListener =
        MaterialButtonToggleGroup.OnButtonCheckedListener { group, checkedId, isChecked ->
            //Logic here
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        materialButtonToggleGroup =
            view.findViewById<MaterialButtonToggleGroup>(R.id.material_toggle_group).apply {
                addOnButtonCheckedListener(materialButtonToggleGroupListener)
            }
    }

    override fun onDestroy() {
        super.onDestroy()
        materialButtonToggleGroup.removeOnButtonCheckedListener(materialButtonToggleGroupListener)
    }
}
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
package com.github.odaridavid.materialx.commons

import androidx.annotation.ColorRes
import androidx.annotation.IdRes
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.button.MaterialButton


internal fun Fragment.getColor(@ColorRes id: Int): Int {
    return ContextCompat.getColor(requireContext(), id)
}

internal fun Fragment.navigateOnClick(@IdRes viewId: Int, @IdRes navAction: Int) {
    view?.findViewById<MaterialButton>(viewId)?.setOnClickListener {
        findNavController().navigate(navAction)
    }
}
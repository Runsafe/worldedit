/*
 * WorldEdit, a Minecraft world manipulation toolkit
 * Copyright (C) sk89q <http://www.sk89q.com>
 * Copyright (C) WorldEdit team and contributors
 *
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.sk89q.worldedit.world.registry;

import com.sk89q.worldedit.world.biome.BaseBiome;
import com.sk89q.worldedit.world.biome.BiomeData;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/**
 * A biome registry that knows nothing.
 */
public class NullBiomeRegistry implements BiomeRegistry {

    /**
     * Create a new instance.
     */
    public NullBiomeRegistry() {
    }

    @Nullable
    @Override
    public BaseBiome createFromId(int id) {
        return null;
    }

    @Override
    public List<BaseBiome> getBiomes() {
        return Collections.emptyList();
    }

    @Nullable
    @Override
    public BiomeData getData(BaseBiome biome) {
        return null;
    }

}

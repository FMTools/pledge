/*
 * Author : Christopher Henard (christopher.henard@uni.lu)
 * Date : 01/11/2012
 * Copyright 2012 University of Luxembourg – Interdisciplinary Centre for Security Reliability and Trust (SnT)
 * All rights reserved
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package pledge.core.techniques.generation;

import java.util.List;
import pledge.core.ModelPLEDGE;
import pledge.core.Product;
import pledge.core.techniques.prioritization.PrioritizationTechnique;

/**
 *
 * @author Christopher Henard
 */
public interface GenerationTechnique {
    
    public List<Product> generateProducts(ModelPLEDGE model, int nbProducts, long timeAllowed, PrioritizationTechnique prioritizationTechnique) throws Exception;
    
    public String getName();
}
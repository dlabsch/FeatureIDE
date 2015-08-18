/* FeatureIDE - A Framework for Feature-Oriented Software Development
 * Copyright (C) 2005-2015  FeatureIDE team, University of Magdeburg, Germany
 *
 * This file is part of FeatureIDE.
 * 
 * FeatureIDE is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * FeatureIDE is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with FeatureIDE.  If not, see <http://www.gnu.org/licenses/>.
 *
 * See http://featureide.cs.ovgu.de/ for further information.
 */
package de.ovgu.featureide.fm.core.base;

import org.prop4j.Node;

/**
 * Factory to create or copy instance of {@link IFeature},  {@link IFeatureModel}, and {@link IConstraint}.
 * 
 * @author Sebastian Krieter
 */
public interface IFeatureModelFactory {

	IFeature copyFeature(IFeature feature, IFeatureModel featureModel);

	IFeatureModel copyFeatureModel(IFeatureModel oldFeatureModel);

	IConstraint createConstraint(IFeatureModel featureModel, Node propNode);

	IFeature createFeature(IFeatureModel featureModel, String name);

	IFeatureModel createFeatureModel();
	
	IFeatureStructure createFeatureStructure(IFeature feature);
	
	IFeatureProperty createFeatureProperty(IFeature feature);
	
	IFeatureModelStructure createFeatureModelStructure(IFeatureModel featureModel);
	
	IFeatureModelProperty createFeatureModelProperty(IFeatureModel featureModel);

}

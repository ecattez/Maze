/**
 * This file is part of Maze.
 *
 * Maze is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Maze is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.				 
 * 
 * You should have received a copy of the GNU General Public License
 * along with Maze.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * @author Edouard CATTEZ <edouard.cattez@sfr.fr> (La 7 Production)
 */
package fr.ecattez.maze.entity;

/**
 * Système de coordonnées (x,y).
 */
public interface Coordinates {
	
	/**
	 * @return	la coordonnée x
	 */
	double getX();
	
	/**
	 * @return	la coordonnée y
	 */
	double getY();
	
	/**
	 * @param	c
	 * 			les coordonnées à ajouter aux coordonnées courante
	 * 
	 * @return	les coordonnées qui représentent la somme de deux couples de coordonnées
	 */
	Coordinates add(Coordinates c);
	
	/**
	 * @param	c
	 * 			les coordonnées à vérifier avec les coordonnées courante
	 * 
	 * @return	<true> si deux couples de coordonnées sont voisins, <false> sinon
	 */
	boolean isCloseTo(Coordinates c);
	
}

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
package fr.ecattez.maze.view;

import fr.ecattez.maze.entity.Maze;

/**
 * Affiche un labyrinthe.
 */
public interface Displayer {
	
	/**
	 * Affiche un labyrinthe
	 * 
	 * @param	maze
	 * 			le labyrinthe à afficher
	 * 
	 * @return une chaîne de caractères représentative du labyrinthe (ou un message en cas d'affichage graphique)
	 */
	public String display(Maze maze);

}

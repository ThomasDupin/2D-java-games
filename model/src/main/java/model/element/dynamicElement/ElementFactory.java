package model.element.dynamicElement;

import contract.IPosition;
import model.element.Element;
import model.element.DPdecorator.EndableDecorator;
import model.element.DPdecorator.ExplosionDecorator;
import model.element.DPdecorator.FallableDecorator;
import model.element.DPdecorator.IaMoovingDecorator;
import model.element.DPdecorator.MinableDecorator;
import model.element.DPdecorator.PickableDecorator;
import model.element.DPdecorator.PushableDecorator;
import model.element.DPdecorator.UnExplosableDecorator;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating Element objects.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public abstract class ElementFactory{
		
		/**
		 * Creates a new Element object.
		 *
		 * @param position the position
		 * @return the element
		 */
		public static Element createMonster(IPosition position){
			return new ExplosionDecorator(new IaMoovingDecorator(new Monster(position)));
		}
		
		/**
		 * Creates a new Element object.
		 *
		 * @param position the position
		 * @return the element
		 */
		public static Element createBoulder(IPosition position){
			return new PushableDecorator(new FallableDecorator(new Boulder(position)));
		}
		
		/**
		 * Creates a new Element object.
		 *
		 * @param position the position
		 * @return the element
		 */
		public static Element createUnbreakable(IPosition position){
			return new UnExplosableDecorator(new Unbreakable(position));
		}
		
		/**
		 * Creates a new Element object.
		 *
		 * @param position the position
		 * @return the element
		 */
		public static Element createDirt(IPosition position){
			return new MinableDecorator(new Dirt(position));
		}
		
		/**
		 * Creates a new Element object.
		 *
		 * @param position the position
		 * @return the element
		 */
		public static Element createDiamond(IPosition position){
			return new PickableDecorator (new FallableDecorator (new Diamond(position)));
		}
		
		/**
		 * Creates a new Element object.
		 *
		 * @param position the position
		 * @return the element
		 */
		public static Element createObsidian(IPosition position){
			return new Obsidian(position);
		}
		
		/**
		 * Creates a new Element object.
		 *
		 * @param position the position
		 * @return the element
		 */
		public static Element createEndgate(IPosition position){
			return new EndableDecorator(new Endgate(position));
		}
		
		/**
		 * Creates a new Element object.
		 *
		 * @param diminutif the diminutif
		 * @param position the position
		 * @return the element
		 */
		public static Element createElement(final String diminutif, IPosition position) {

			switch (diminutif) {
				case "b":
					return createBoulder(position);
				case "d":
					return createDirt(position);
				case "i":
					return createObsidian(position);
				case "o":
					return createDiamond(position);
				case "m":
					return createMonster(position);
				case "x":
					return createUnbreakable(position);
				case "v":
					return null;
				case "p":
					return null;
				case "t":
					return createEndgate(position);
				default:
					return null;
			}
		}
}

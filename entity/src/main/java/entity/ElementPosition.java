package entity;

// TODO: Auto-generated Javadoc
/**
 * The Class ElementPosition.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
public class ElementPosition extends Entity {
		
		/** The Diminutif. */
		private String Diminutif;
		
		/** The x. */
		private int X;
		
		/** The y. */
		private int y;
		
		/**
		 * Instantiates a new element position.
		 *
		 * @param diminutif the diminutif
		 * @param x the x
		 * @param y the y
		 */
		public ElementPosition(String diminutif, int x, int y) {
			this.setDiminutif(diminutif);
			this.setX(x);
			this.setY(y);
		}
		
		/**
		 * Gets the y.
		 *
		 * @return the y
		 */
		public int getY() {
			return y;
		}

		/**
		 * Sets the y.
		 *
		 * @param y the new y
		 */
		public void setY(int y) {
			this.y = y;
		}

		/**
		 * Gets the x.
		 *
		 * @return the x
		 */
		public int getX() {
			return X;
		}

		/**
		 * Sets the x.
		 *
		 * @param x the new x
		 */
		public void setX(int x) {
			this.X = x;
		}

		/**
		 * Gets the diminutif.
		 *
		 * @return the diminutif
		 */
		public String getDiminutif() {
			return Diminutif;
		}

		/**
		 * Sets the diminutif.
		 *
		 * @param diminutif the new diminutif
		 */
		public void setDiminutif(String diminutif) {
			Diminutif = diminutif;
		}
}

package emblcmci.linker.costfunctions;

import emblcmci.linker.AbstractDotLinker;

/** an implementation of cost calculation only by distance. The simplest form of "Nearest neighbor".
 * 
 * @author Kota Miura
 *
 */
public class LinkCostsOnlyDistance implements LinkCosts{

	@Override
	public double calccost(AbstractDotLinker.Particle p1, AbstractDotLinker.Particle p2) {
		double cost =	(p2.getX()-p1.getX())*(p2.getX()-p1.getX()) +
						(p2.getY()-p1.getY())*(p2.getY()-p1.getY()) +
						(p2.getZ()-p1.getZ())*(p2.getZ()-p1.getZ());
		// TODO Auto-generated method stub
		return cost;
	}
	
}

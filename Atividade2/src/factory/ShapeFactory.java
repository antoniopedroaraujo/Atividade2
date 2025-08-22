package factory;

import config.ShapeConfig;
import shapes.Shape;

public interface ShapeFactory {
    Shape createShapePadrao(ShapeConfig shapeConfigPadrao);
    Shape createShapeCustom(ShapeConfig shapeConfig);

}

package FunctionLayer;

public class SVG {

    public String createSVG (int height, int width, int length) {

        String start_SVG = "<?xml version='1.0'?><!DOCTYPE svg PUBLIC '-//W3C//DTD SVG 1.1//EN' 'http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd'>\n" +
                "\n" +
                "<svg version='1.1' xmlns='http://www.w3.org/2000/svg' xmlns:xlink='http://www.w3.org/1999/xlink' height='100%' viewBox=' 0 0 830 650' preserveAspectRatio='xMinYMin'>\n" +
                "\n" +
                "<svg version='1.1' xmlns='http://www.w3.org/2000/svg' xmlns:xlink='http://www.w3.org/1999/xlink' x='60' width='"+width+"' height='"+height+"' viewBox=' 0 0 "+height+" "+width+"' preserveAspectRatio='xMinYMin'>";

        int start_rem = 35;
        double end_rem = height - 39.5;
        int vindkryds_y = height - 35;

        String body_SVG = "<!-- Ramme -->\n" +
                "\n" +
                "    <rect x='0' y='0' width='"+width+"' height='"+height+"' style='stroke:black; fill: white;'/>\n" +
                "\n" +
                "    <!-- Remme -->\n" +
                "    <rect x='0' y='"+start_rem+"' width='"+width+"' height='4.5' style='stroke:black; fill: white;'/>\n" +
                "    <rect x='0' y='"+end_rem+"' width='"+width+"' height='4.5' style='stroke:black; fill: white;'/>\n" +
                "\n" +
                "    <!-- vindkryds -->\n" +
                "\n" +
                "    <line x1='55' y1='"+start_rem+"' x2='550' y2='"+vindkryds_y+"' style='stroke:black; fill white; stroke-dasharray: 10 10;'/>\n" +
                "    <line x1='50' y1='"+start_rem+"' x2='545' y2='"+vindkryds_y+"' style='stroke:black; fill white; stroke-dasharray: 10 10;'/>\n" +
                "    \n" +
                "    <line x1='550' y1='"+start_rem+"' x2='55' y2='"+vindkryds_y+"' style='stroke:black; fill white; stroke-dasharray: 10 10;'/>\n" +
                "    <line x1='545' y1='"+start_rem+"' x2='50' y2='"+vindkryds_y+"' style='stroke:black; fill white; stroke-dasharray: 10 10;'/>\n" +
                "\n" +
                "\n" +
                "    <!-- Spær -->\n" +
                "    <rect x='0' y='0' width='4.5' height='"+height+"' style='stroke:black; fill: white;'/>\n" +
                "    <rect x='55' y='0' width='4.5' height='"+height+"' style='stroke:black; fill: white;'/>\n" +
                "    <rect x='110' y='0' width='4.5' height='"+height+"' style='stroke:black; fill: white;'/>\n" +
                "    <rect x='165' y='0' width='4.5' height='"+height+"' style='stroke:black; fill: white;'/>\n" +
                "    <rect x='220' y='0' width='4.5' height='"+height+"' style='stroke:black; fill: white;'/>\n" +
                "    <rect x='275' y='0' width='4.5' height='"+height+"' style='stroke:black; fill: white;'/>\n" +
                "    <rect x='330' y='0' width='4.5' height='"+height+"' style='stroke:black; fill: white;'/>\n" +
                "    <rect x='385' y='0' width='4.5' height='"+height+"' style='stroke:black; fill: white;'/>\n" +
                "    <rect x='440' y='0' width='4.5' height='"+height+"' style='stroke:black; fill: white;'/>\n" +
                "    <rect x='495' y='0' width='4.5' height='"+height+"' style='stroke:black; fill: white;'/>\n" +
                "    <rect x='550' y='0' width='4.5' height='"+height+"' style='stroke:black; fill: white;'/>\n" +
                "    <rect x='605' y='0' width='4.5' height='"+height+"' style='stroke:black; fill: white;'/>\n" +
                "    <rect x='660' y='0' width='4.5' height='"+height+"' style='stroke:black; fill: white;'/>\n" +
                "    <rect x='715' y='0' width='4.5' height='"+height+"' style='stroke:black; fill: white;'/>\n" +
                "    <rect x='770' y='0' width='4.5' height='"+height+"' style='stroke:black; fill: white;'/></svg>";

        String function_SVG = " <defs>\n" +
                "    <marker id='beginArrow' \n" +
                "    \tmarkerWidth='9' markerHeight='9' \n" +
                "    \trefX='0' refY='4' \n" +
                "    \torient='auto'>\n" +
                "        <path d='M0,4 L8,0 L8,8 L0,4' style='fill: #000000s;' />\n" +
                "    </marker>\n" +
                "    <marker id='endArrow' \n" +
                "    \tmarkerWidth='9' markerHeight='9' \n" +
                "    \trefX='8' refY='4' \n" +
                "    \torient='auto'>\n" +
                "        <path d='M0,0 L8,4 L0,8 L0,0' style='fill: #000000;' />\n" +
                "    </marker>\n" +
                "</defs>\n" +
                "<line x1='20'  y1='0' x2='20'   y2='600' \n" +
                "\tstyle='stroke:black;\n" +
                "\tmarker-start: url(#beginArrow);\n" +
                "   marker-end: url(#endArrow);'/>\n" +
                "\n" +
                "   <text transform='rotate(-90 15, 300)' x='15' y='300'>600 cm </text>\n" +
                "\n" +
                "<line x1='40'  y1='35' x2='40'   y2='565' \n" +
                "\tstyle='stroke:black;\n" +
                "\tmarker-start: url(#beginArrow);\n" +
                "   marker-end: url(#endArrow);'/>\n" +
                "\n" +
                "   <line x1='60'  y1='620' x2='830'   y2='620' \n" +
                "\tstyle='stroke:black;\n" +
                "\tmarker-start: url(#beginArrow);\n" +
                "   marker-end: url(#endArrow);'/>\n" +
                "</svg>\n";

        String return_SVG = start_SVG + body_SVG + function_SVG;
        return return_SVG;
    }
}

package mx.uatx.sipeeec.util;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;


public class ReporteUtils {

    public static  void generaReporte(Map<String,Object> parametros,String reportPath,String reportName) {

        try {
            FacesContext context=FacesContext.getCurrentInstance();
            ServletContext servletContext=(ServletContext) context.getExternalContext().getContext();
            reportPath=servletContext.getRealPath(reportPath);
            HttpServletResponse response=(HttpServletResponse)context.getExternalContext().getResponse();

            response.addHeader("Content-Disposition", "attachment; filename="+reportName+".pdf");
            response.setContentType("application/pdf");

            JasperPrint jasperPrint= JasperFillManager.fillReport(reportPath, parametros, new JREmptyDataSource());
            JasperExportManager.exportReportToPdfStream(jasperPrint, response.getOutputStream());

            context.getApplication().getStateManager().saveView(context);
            context.responseComplete();

        } catch (Exception e) {
            throw new RuntimeException("Eror al generar reporte " + e.getMessage());
        }
    }


}

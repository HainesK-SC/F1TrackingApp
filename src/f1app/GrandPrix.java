/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package f1app;

/**
 *
 * @author Kyle Haines - 2025
 */
public class GrandPrix {
    private String locationName;
    private String locationDate;
    private String startTimeLocal;
    private Boolean isSprintWeekend;

    /**
     * @return the locationName
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * @param locationName the locationName to set
     */
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    /**
     * @return the locationDate
     */
    public String getLocationDate() {
        return locationDate;
    }

    /**
     * @param locationDate the locationDate to set
     */
    public void setLocationDate(String locationDate) {
        this.locationDate = locationDate;
    }

    /**
     * @return the startTimeLocal
     */
    public String getStartTimeLocal() {
        return startTimeLocal;
    }

    /**
     * @param startTimeLocal the startTimeLocal to set
     */
    public void setStartTimeLocal(String startTimeLocal) {
        this.startTimeLocal = startTimeLocal;
    }

    /**
     * @return the isSprintWeekend
     */
    public Boolean getIsSprintWeekend() {
        return isSprintWeekend;
    }

    /**
     * @param isSprintWeekend the isSprintWeekend to set
     */
    public void setIsSprintWeekend(Boolean isSprintWeekend) {
        this.isSprintWeekend = isSprintWeekend;
    }
}

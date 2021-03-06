package hotelapp.bindingModels;

import javax.validation.constraints.NotNull;

public class TaskBindingModel {
    @NotNull
    private String description;

    @NotNull
    private String typeName;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
